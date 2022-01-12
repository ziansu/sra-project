public int getItem(com.auenland.gms.fragments.ShopItem find) {
    for (int i = 0; i < (size()); i++) {
        if (get(i).getId().equals(find.getId())) {
            return i;
        }
    }
    return -1;
}