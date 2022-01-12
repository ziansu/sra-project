public void printData() {
    java.lang.System.out.println(("List: " + (list.size())));
    for (com.iankeefer.model.items.Item item : list) {
        if (item instanceof com.iankeefer.model.items.impl.Gun) {
            com.iankeefer.model.items.impl.Gun gun = ((com.iankeefer.model.items.impl.Gun) (item));
            java.lang.System.out.println(((((("Item: " + (gun.getWeapon())) + " Skin: ") + (gun.getSkin())) + " Collection: ") + (gun.getCollection())));
        }
    }
}