public static void String(char[] str) {
    int i = 0;
    int len = str.length;
    while ((i < len) && ((str[i]) != ' ')) {
        java.lang.System.out.print(str[i]);
        i++;
    } 
}