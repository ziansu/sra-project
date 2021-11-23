public static void enterchk() {
    for (java.lang.String value : GosLink2.gb.enters) {
        GosLink2.dw.append(value);
        int num = java.lang.Integer.parseInt(value.substring(0, 1));
        GosLink2.TNH.get(num).write(value.substring(2));
    }
    GosLink2.gb.enters.clear();
}