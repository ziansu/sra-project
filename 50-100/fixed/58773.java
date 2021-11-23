static <T extends com.yandex.money.api.methods.AccountInfo> void serialize(com.google.gson.JsonObject object, T src) {
    object.addProperty(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_ACCOUNT, src.account);
    object.addProperty(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_BALANCE, src.balance);
    object.addProperty(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_CURRENCY, src.currency.numericCode.toString());
    object.addProperty(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_STATUS, src.accountStatus.code);
    object.addProperty(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_TYPE, src.accountType.code);
    object.add(com.yandex.money.api.typeadapters.methods.AccountInfoTypeAdapter.Delegate.MEMBER_BALANCE_DETAILS, com.yandex.money.api.typeadapters.model.BalanceDetailsTypeAdapter.getInstance().toJsonTree(src.balanceDetails));
}