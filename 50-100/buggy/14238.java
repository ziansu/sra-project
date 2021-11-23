public static void main(java.lang.String[] args) {
    java.util.ArrayList<java.lang.Double> powList = new java.util.ArrayList<>();
    for (double a = 2; a <= 100; a++) {
        for (double b = 2; b <= 100; b++) {
            powList.add(java.lang.Math.pow(a, b));
        }
    }
    java.util.HashSet<java.lang.Double> powHash = new java.util.HashSet<>(powList);
    java.lang.System.out.println(powHash.size());
}