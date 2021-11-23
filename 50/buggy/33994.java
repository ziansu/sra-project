public int count(com.javapractice.leetcode.HashMap<java.lang.Integer, java.lang.Integer> map) {
    int result = 0;
    for (int val : map.values()) {
        result += val * (val - 1);
    }
    return result;
}