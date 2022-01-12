private void replace(java.lang.StringBuilder val, char c, char rep) {
    for (int i = 0; i < (val.length()); i++) {
        if ((val.charAt(i)) == c) {
            val.deleteCharAt(i);
            val.insert(i, rep);
            val.insert(i, "\\");
            i++;
        }
    }
}