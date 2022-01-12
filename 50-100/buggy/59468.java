public int checkout(int itemId, com.twu.biblioteca.model.Item.TYPES itemType) {
    com.twu.biblioteca.model.Item item = library.getItemManager().getItemByIdAndType(itemId, itemType);
    if (item != null) {
        library.checkout(user, item);
        return 0;
    }else {
        return 1;
    }
}