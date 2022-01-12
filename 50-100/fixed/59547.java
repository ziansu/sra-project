public void onDoubleClick(org.primefaces.event.SelectEvent selectEvent) throws java.io.IOException {
    if ((selectEvent.getObject()) == null) {
        return ;
    }
    de.yaskor.whisk.entity.Item item = ((de.yaskor.whisk.entity.Item) (selectEvent.getObject()));
    org.primefaces.context.RequestContext context = org.primefaces.context.RequestContext.getCurrentInstance();
    if (item.isDirectory()) {
        breadCrumpsCtrl.changeDirectory(item);
        selected.clear();
        context.execute("updFiles();");
    }else {
        itemUtils.onOpen(item);
    }
}