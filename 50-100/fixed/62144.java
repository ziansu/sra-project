private java.util.Set<java.lang.String> gdxArrayToCollection(com.badlogic.gdx.utils.Array<java.lang.String> array) {
    java.util.Set<java.lang.String> col = new java.util.TreeSet<java.lang.String>();
    for (int i = 0; i < (array.size); i++) {
        col.add(array.get(i));
    }
    if ((col.size()) == 0) {
        return null;
    }
    return col;
}