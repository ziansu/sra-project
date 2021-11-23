public void readJavaFile(java.lang.String fname) {
    try {
        java.util.Scanner sc = new java.util.Scanner(new java.io.File(fname));
        fileContents = sc.useDelimiter("\\Z").next();
        java.lang.System.out.println(fileContents);
        sc.close();
    } catch (java.io.IOException ioe) {
        java.lang.System.out.println(ioe.getMessage());
    }
}