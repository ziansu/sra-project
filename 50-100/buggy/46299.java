public static void main() {
    java.lang.String s = "abc";
    char[] str = s.toCharArray();
    char c = str[2];
    char a = s.charAt(0);
    assert (str.length) == 3;
    assert a == 'a';
    assert c == 'c';
}