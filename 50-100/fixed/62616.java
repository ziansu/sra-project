private static void chopUpStringBuffer(java.lang.StringBuilder sb) {
    if ((sb.length()) < 256) {
        return ;
    }else {
        for (int i = 240; i < (sb.length()); i++) {
            if ((sb.charAt(i)) == ' ') {
                sb.setCharAt(i, '\n');
                i += 240;
            }
        }
    }
}