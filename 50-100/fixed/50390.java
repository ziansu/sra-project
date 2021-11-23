private void setData(java.util.List<com.parse.ParseObject> list) {
    for (int i = 0; i < (list.size()); i++) {
        data[i] = (list.get(i).getString("sender")) + " ";
    }
}