public static void checkAvailability() {
    try {
        File sourcer = new File("houses.dat");
        if (!(sourcer.exists()))
            sourcer.createNewFile();
        
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Error " + e));
    }
}