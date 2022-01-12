@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    for (org.dcache.webadmin.view.util.SelectableWrapper<org.dcache.webadmin.view.beans.ActiveTransfersBean> wrapper : _transfers) {
        wrapper.setSelected(true);
    }
}