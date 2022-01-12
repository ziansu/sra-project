public static java.lang.String substring(java.lang.String str, int idx) {
    char[] word = str.toCharArray();
    java.util.ArrayList subSTR = new java.util.ArrayList();
    for (int x = 0; x <= (idx - 1); x++) {
        subSTR.add(word[x]);
    }
    str = subSTR.toString();
    return str;
}