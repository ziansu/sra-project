private void changMultiMenuText(cc.easyandroid.listfiltermenu.core.IEasyItem iEasyItem, cc.easyandroid.listfiltermenu.core.ListFilterAdapter<cc.easyandroid.listfiltermenu.core.IEasyItem> adapter) {
    if (!(iEasyItem.isNoLimitItem())) {
        multiTitles.put(adapter.getParentIEasyItem().getDisplayName().hashCode(), iEasyItem.getDisplayName());
    }else {
        multiTitles.delete(adapter.getParentIEasyItem().getDisplayName().hashCode());
    }
    if ((onMultiMenuTitleFormat) != null) {
        onMultiMenuTitleFormat.format(this, multiTitles);
    }
}