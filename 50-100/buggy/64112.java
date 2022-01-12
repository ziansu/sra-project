public static void main(java.lang.String[] args) {
    java.io.File file = new java.io.File(args[0]);
    if (file.exists()) {
        java.util.ArrayList<java.io.File> vmList = IO.fileOrDirectory(file);
        java.lang.String outputFileName = IO.setOutputFileName(vmList.size(), file);
        IO.readAllVmFiles(vmList);
        IO.writeToASingleAsmFile(outputFileName);
    }else {
        java.lang.System.out.println(IO.FILE_NOT_EXISTS);
    }
}