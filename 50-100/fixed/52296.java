private static void readAllVmFiles(java.util.ArrayList<java.io.File> vmList) {
    for (int j = 0; j < (vmList.size()); j++) {
        try (java.io.FileReader vmFile = new java.io.FileReader(vmList.get(j));java.io.BufferedReader reader = new java.io.BufferedReader(vmFile)) {
            IO.readAndParse(reader, vmList.get(j).getName());
        } catch (java.io.IOException e) {
            java.lang.System.out.println(IO.UNREADABLE_FILE);
        }
    }
}