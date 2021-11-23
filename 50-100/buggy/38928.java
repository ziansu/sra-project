public java.lang.String toStringTagList(java.util.ArrayList<java.lang.String> list) {
    java.lang.String string = "";
    for (int i = 0; i < (list.size()); i++) {
        if ((i + 1) == (list.size())) {
            string += (list.get(i)) + ", ";
        }else {
            string += list.get(i);
        }
    }
    return string;
}