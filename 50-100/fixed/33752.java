public java.lang.String detail_CN(java.util.ArrayList<java.lang.String> info, java.lang.String namestring) {
    java.lang.String det = null;
    for (int i = 0; i < (info.size()); i++) {
        if (info.get(i).equals(namestring)) {
            det = info.get((i + 3));
        }
    }
    return det;
}