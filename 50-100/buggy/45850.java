public com.javapractice.leetcode.List<java.lang.String> readBinaryWatch(int num) {
    com.javapractice.leetcode.List<java.lang.String> list = new com.javapractice.leetcode.ArrayList();
    for (int i = 0; (i <= num) && (i < 5); i++) {
        for (java.lang.String hour : possibleHours(i)) {
            for (java.lang.String minute : possibleMinutes((num - i))) {
                list.add(((hour + ":") + minute));
            }
        }
    }
    return list;
}