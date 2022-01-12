public void setData(java.util.Map<java.lang.String, java.lang.String> data) {
    getData().getRaw().clear();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> e : data.entrySet()) {
        getData().getRaw().put(e.getKey(), e.getValue());
    }
    update();
}