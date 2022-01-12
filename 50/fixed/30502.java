public static int showItemNumber(java.lang.String id) {
    if (com.weex.sammy.mcshop.MCShoppingListHelper.mShoppingMap.containsKey(id)) {
        int number = java.lang.Integer.parseInt(com.weex.sammy.mcshop.MCShoppingListHelper.mShoppingMap.get(id));
        return number;
    }else {
        return 0;
    }
}