public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        java.lang.System.out.println(Hex.format(BinaryFile.read("Hex.class")));
    }else {
        java.lang.System.out.println(Hex.format(BinaryFile.read(new java.io.File(args[0]))));
    }
}