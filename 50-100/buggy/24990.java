public static boolean deleteFile(java.lang.String filename) {
    java.lang.System.out.println(("Deleting " + filename));
    try {
        java.io.File outtree = new java.io.File(filename);
        if (outtree.exists())
            outtree.delete();
        
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Can't Delete " + filename));
        return false;
    }
    return true;
}