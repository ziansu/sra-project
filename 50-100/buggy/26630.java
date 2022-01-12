public java.lang.String andifyParents(java.lang.String[] s) {
    java.lang.String result = "";
    for (int i = 0; i < (s.length); i++) {
        if (i >= 1) {
            result = result + " & ";
        }
        result = result + (capitalize(s[i]));
    }
    return result;
}