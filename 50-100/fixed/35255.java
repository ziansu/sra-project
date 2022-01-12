private java.lang.String getDeviceNo() {
    java.lang.String fileName = (android.os.Environment.getExternalStorageDirectory()) + "/nesldev";
    try {
        java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(fileName));
        java.util.Scanner scanner = new java.util.Scanner(fis);
        java.lang.String firstLine = scanner.nextLine();
        firstLine = firstLine.trim();
        fis.close();
        return firstLine;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "x";
}