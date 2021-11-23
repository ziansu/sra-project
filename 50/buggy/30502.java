public static int showItemNumber(com.weex.sammy.mcshop.MCItem item) {
    if (com.weex.sammy.mcshop.MCShoppingListHelper.mShoppingMap.containsKey(item.id)) {
        int number = java.lang.Integer.parseInt(com.weex.sammy.mcshop.MCShoppingListHelper.mShoppingMap.get(item.id));
        number++;
        return number;
    }else {
        return 0;
    }
}