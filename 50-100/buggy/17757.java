public com.javapractice.leetcode.HashMap<java.lang.Character, java.lang.Integer> buildMap() {
    char[] charMap = new char[]{ 'z' , 'o' , 'w' , 'h' , 'u' , 'f' , 'x' , 's' , 'g' , 'i' };
    com.javapractice.leetcode.HashMap<java.lang.Character, java.lang.Integer> map = new com.javapractice.leetcode.HashMap();
    for (int i = 0; i < 10; i++) {
        map.put(charMap[i], i);
    }
    return map;
}