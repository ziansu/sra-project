static synchronized java.lang.String getAuthority(android.content.Context context) {
    if (android.text.TextUtils.isEmpty(org.xjy.android.treasure.provider.TreasureContract.sAuthority)) {
        org.xjy.android.treasure.provider.TreasureContract.sAuthority = context.getString(R.string.org_xjy_android_treasure_authority);
    }
    return org.xjy.android.treasure.provider.TreasureContract.sAuthority;
}