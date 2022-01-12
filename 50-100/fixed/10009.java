public static void delete(java.io.File f) throws java.io.IOException {
    if (f == null)
        return ;
    
    if (f.isDirectory()) {
        for (java.io.File c : f.listFiles()) {
            org.ohmage.Utilities.delete(c);
        }
    }
    f.delete();
}