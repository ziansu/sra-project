public static java.util.List<java.lang.String> ClassifiedValueList(java.util.List<io.github.data4all.model.data.ClassifiedValue> list, android.content.res.Resources res) {
    java.util.List<java.lang.String> listValue = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < (list.size()); i++) {
        listValue.add(res.getString(list.get(i).getNameRessource()));
    }
    return listValue;
}