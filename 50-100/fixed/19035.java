static RefString generateString(int n, int max) {
    if (n < 1) {
        java.lang.System.out.println("Error: cannot create a reference string shorter than 1.");
        return null;
    }
    java.util.Random rand = new java.util.Random();
    java.util.ArrayList<java.lang.Integer> ar = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < n; i++) {
        ar.add(rand.nextInt(max));
    }
    RefString rs = new RefString(ar);
    return rs;
}