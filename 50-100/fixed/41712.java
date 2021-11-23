@java.lang.SuppressWarnings(value = "unchecked")
private static java.lang.String rgen(java.lang.String str, int count, java.util.ArrayList<java.lang.String> chars) {
    if (count == 0) {
        return str;
    }else {
        for (int i = 0; i < (chars.size()); i++) {
            str += ((java.lang.String) (chars.get(i)));
            count--;
            Rules.rgen(str, count, chars);
            java.lang.System.out.println(str);
        }
    }
    return str;
}