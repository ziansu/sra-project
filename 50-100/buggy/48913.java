private java.lang.String readServerFilename(byte[] listBuf, java.io.BufferedReader in) throws java.io.IOException {
    if ((args.length) != 1) {
        java.lang.System.out.println(new java.lang.String(listBuf));
        java.lang.System.out.println("Type file name on server: ");
        return in.readLine();
    }else {
        return args[1];
    }
}