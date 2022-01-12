public int distributeCandies(int[] candies) {
    java.util.HashSet<java.lang.Integer> set = new java.util.HashSet<>();
    for (int i : candies) {
        set.add(i);
    }
    return java.lang.Math.min(((candies.length) / 2), set.size());
}