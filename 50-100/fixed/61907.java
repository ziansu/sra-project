public boolean hasItem(com.auenland.gms.fragments.ShopItem item) {
    for (int i = 0; i < (size()); i++) {
        if (get(i).getId().equals(item.getId())) {
            return true;
        }
    }
    return false;
}