@com.taobao.weex.common.WXModuleAnno
public void showItemNumber(com.weex.sammy.mcshop.MCItem item, com.taobao.weex.bridge.JSCallback callback) {
    int number = com.weex.sammy.mcshop.MCShoppingListHelper.showItemNumber(item);
    callback.invoke(number);
}