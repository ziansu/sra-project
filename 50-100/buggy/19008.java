public int distributeCandies(int[] candies) {
    com.javapractice.leetcode.HashSet<java.lang.Integer> set = new com.javapractice.leetcode.HashSet();
    for (int i : candies) {
        set.add(i);
    }
    return java.lang.Math.min(((candies.length) / 2), set.size());
}