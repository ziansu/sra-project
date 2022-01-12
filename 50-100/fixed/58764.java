private static void writeAndPrint(java.lang.String value, boolean isWrite) {
    if (isWrite) {
        main.Test.prepareFile(main.Test.linkValue, false);
        java.lang.System.out.print(value);
        main.Test.outputStream.println(value);
        main.Test.outputStream.close();
    }else {
        java.lang.System.out.print(value);
    }
}