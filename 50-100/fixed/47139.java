public static void reverseIterative(char[] s, int length) {
    for (int i = 0; i < ((length - 1) / 2); i++) {
        reverseString.ReverseString.swap(s, i, ((length - 2) - i));
    }
}