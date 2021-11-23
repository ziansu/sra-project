public void setEnemyelement() {
    java.util.Random rnd = new java.util.Random();
    rnd.setSeed(java.lang.System.currentTimeMillis());
    int eVal = ((java.lang.Math.abs(rnd.nextInt())) % 4) + 1;
    enemyelement = eVal;
}