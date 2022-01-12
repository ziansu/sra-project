public java.lang.String arrayListToString(java.util.ArrayList felipe) {
    java.lang.String result = "[";
    for (int i = 0; i < (felipe.size()); i++) {
        if (i == ((felipe.size()) - 1)) {
            result += felipe.get(i);
        }else {
            result += (felipe.get(i)) + "  ";
        }
    }
    result += "]";
    return result;
}