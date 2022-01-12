public java.lang.Object[][] toMultiArrayNumber(com.softserve.edu.atqc.data.apps.ApplicationSources applicationSources, java.util.List<?> list) {
    java.lang.Object[][] array = toMultiArrayNumber(2, list);
    for (int i = 0; i < (list.size()); i++) {
        array[i][0] = applicationSources;
    }
    return array;
}