@java.lang.Override
public java.util.List<java.util.List<java.lang.Object>> getData(java.util.List<java.lang.String> order) {
    java.util.List<java.util.List<java.lang.Object>> data = new java.util.ArrayList<>();
    for (java.lang.String key : order) {
        if ((key != null) && ((categoricalData.get(key)) != null)) {
            data.add(new java.util.ArrayList<java.lang.Object>(categoricalData.get(key)));
        }else {
            data.add(null);
        }
    }
    return data;
}