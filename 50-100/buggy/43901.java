public int handback(int id, com.twu.biblioteca.model.Item.TYPES itemType) {
    com.twu.biblioteca.model.Item item = library.getItemManager().getItemByIdAndType(id, itemType);
    if (item != null) {
        library.unCheckout(user, item);
        return 0;
    }else {
        return 1;
    }
}