public static void String(char[] str) {
    int i = 0;
    int len = str.length;
    while ((i < len) && ((str[i]) != ' ')) {
        i++;
    } 
    java.lang.System.out.print(new java.lang.String(str, 0, i));
}