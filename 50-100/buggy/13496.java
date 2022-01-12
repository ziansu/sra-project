public float euclideanDist(Amostra a, Amostra b, int nAtrib) {
    float dist = 0.0F;
    for (int i = 0; i < nAtrib; i++) {
        java.lang.System.out.println(a.getVal(i));
        dist += ((float) (java.lang.Math.pow(((a.getVal(i)) - (b.getVal(i))), 2)));
    }
    return ((float) (java.lang.Math.sqrt(dist)));
}