public void onClick(android.content.DialogInterface dialog, int item) {
    cShopItem[0] = shopNamesArray[item];
    android.widget.Toast.makeText(getApplicationContext(), (("\u0422\u043e\u0440\u0433\u043e\u0432\u0430\u044f \u0442\u043e\u0447\u043a\u0430 \"" + (storemanager.com.app.utils.Utils.cShops[item])) + "\""), Toast.LENGTH_SHORT).show();
}