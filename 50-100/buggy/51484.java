public static java.lang.String[] ClassifiedValueList(java.util.List<io.github.data4all.model.data.ClassifiedValue> list, android.content.res.Resources res) {
    java.lang.String[] listValue = new java.lang.String[list.size()];
    for (int i = 0; i < (list.size()); i++) {
        listValue[i] = res.getString(list.get(i).getNameRessource());
    }
    return listValue;
}