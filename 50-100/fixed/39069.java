public void changeName(java.lang.String oldName, java.lang.String newName) {
    for (int i = 0; i < (content.size()); i++) {
        if (content.get(i).equals(oldName)) {
            content.set(i, newName);
            java.util.Collections.sort(content);
            notifyDataSetChanged();
            break;
        }
    }
}