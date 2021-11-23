public static void main(java.lang.String[] args) {
    java.util.List gerbils = new java.util.ArrayList();
    for (int i = 0; i < 25; i++)
        gerbils.add(new Gerbil.Gerbil(i));
    
    for (int i = 0; i < 25; i++) {
        java.lang.System.out.printf("This is gerbil #%d", gerbils.get(i));
        Gerbil.Gerbil.hop(gerbils.get(i));
    }
}