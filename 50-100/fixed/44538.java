public static void checkAvailability() {
    try {
        java.io.File sourcer = new java.io.File("houses.dat");
        if (!(sourcer.exists()))
            sourcer.createNewFile();
        
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Error " + e));
    }
}