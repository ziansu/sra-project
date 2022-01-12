private java.lang.String MyReadFromSD() throws java.io.IOException {
    java.io.FileInputStream is = null;
    java.lang.String info = null;
    try {
        is = new java.io.FileInputStream(myfilepath);
        byte[] car = new byte[10];
        int len = 0;
        while ((-1) != (len = is.read(car))) {
            info += new java.lang.String(car, 0, len);
            java.lang.System.out.println(info);
        } 
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
    return info;
}