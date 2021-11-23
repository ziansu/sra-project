private void setData(java.util.List<com.parse.ParseObject> list) {
    java.lang.String newFriend;
    for (int i = 0; i < (list.size()); i++) {
        newFriend = (list.get(i).getString("sender")) + " ";
        data[i] = newFriend;
    }
}