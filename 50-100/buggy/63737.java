public void setVirtualItem(boolean virtual) {
    if ((org.lhedav.pp.backing_beans.provider.services.AddItem.item) == null) {
        return ;
    }
    virtualItem = virtual;
    org.lhedav.pp.backing_beans.provider.services.AddItem.item.setVirtual((virtualItem ? ((short) (1)) : ((short) (0))));
}