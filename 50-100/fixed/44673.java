public static void main(java.lang.String[] args) {
    java.util.ArrayList<Gerbil.Gerbil> gerbils = new java.util.ArrayList<Gerbil.Gerbil>();
    for (int i = 0; i < 25; i++)
        gerbils.add(new Gerbil.Gerbil(i));
    
    for (int i = 0; i < 25; i++) {
        gerbils.get(i).hop();
    }
}