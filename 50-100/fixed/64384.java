private static int getBCC(java.lang.String cmd) {
    int bcc = 0;
    for (int i = 1; i <= ((cmd.length()) / 2); i++) {
        bcc ^= java.lang.Integer.parseInt(cmd.substring(((i * 2) - 2), (i * 2)), 16);
    }
    return bcc;
}