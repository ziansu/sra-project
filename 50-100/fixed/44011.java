public java.util.List<com.pajato.android.gamechat.common.adapter.ListItem> getList(android.app.Activity activity) {
    java.util.List<com.pajato.android.gamechat.common.adapter.ListItem> items = new java.util.ArrayList<>();
    items.add(new com.pajato.android.gamechat.common.adapter.ListItem(com.pajato.android.gamechat.common.adapter.ListItem.ItemType.helpHeader, R.string.HelpAllTitle));
    items.addAll(getAllArticles(activity));
    items.add(new com.pajato.android.gamechat.common.adapter.ListItem(com.pajato.android.gamechat.common.adapter.ListItem.ItemType.helpHeader, R.string.HelpMostPopularTitle));
    items.addAll(getMostPopularArticles(activity));
    items.add(new com.pajato.android.gamechat.common.adapter.ListItem(com.pajato.android.gamechat.common.adapter.ListItem.ItemType.helpHeader, R.string.HelpRecentTitle));
    items.addAll(getRecentArticles(activity));
    return items;
}