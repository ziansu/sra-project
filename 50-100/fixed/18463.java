public double bilanBateau(bateau.Bateau b, int nb) {
    java.lang.System.out.println(b.toString());
    java.lang.System.out.println((("plastique requis : " + ((b.getPlastiqueRequis()) * nb)) + " tonnes"));
    java.lang.System.out.println((("bois requis : " + ((b.getBoisRequis()) * nb)) + " m3"));
    return 0;
}