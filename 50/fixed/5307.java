public static mas.go.util.Stone getValue(java.lang.String value) {
    value = value.trim().toLowerCase();
    if (value.equals("black")) {
        return mas.go.util.Stone.BLACK;
    }else {
        return mas.go.util.Stone.WHITE;
    }
}