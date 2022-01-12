@java.lang.Override
public java.lang.String solve() {
    int maxValue = 0;
    for (int v1 = low; v1 <= (high); v1++) {
        for (int v2 = low; v2 <= (high); v2++) {
            final int value = v1 * v2;
            if (io.github.andrioli.euler.utils.StringUtils.isPalindrome(java.lang.Integer.toString(value))) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
    }
    return java.lang.Integer.toString(maxValue);
}