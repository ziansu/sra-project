@java.lang.Override
public boolean select(org.bukkit.entity.Player viewer, org.bukkit.event.inventory.ClickType clickType) {
    if ((link) == null)
        return false;
    
    if ((onClick) != null) {
        onClick.accept(viewer);
    }
    us.blockbox.uilib.component.PageChangerImpl.viewManager.setView(viewer, link, true);
    return true;
}