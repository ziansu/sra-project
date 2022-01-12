public static void reverseCharArray(char[] text) {
    if (text != null) {
        int n = (text.length) - 1;
        for (int i = (n - 1) >> 1; i >= 0; --i) {
            char tmp = text[i];
            text[i] = text[(n - i)];
            text[(n - i)] = tmp;
        }
    }
}