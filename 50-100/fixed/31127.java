@java.lang.Override
public void onScreenClose(org.getspout.spoutapi.event.screen.ScreenCloseEvent e) {
    if (!((e.getScreenType()) == (org.getspout.spoutapi.gui.ScreenType.CUSTOM_SCREEN)))
        return ;
    
    if (!((e.getScreen()) instanceof org.dyndns.pamelloes.xAuthSpout.StartMenu))
        return ;
    
    if (!(e.getScreen().equals(this)))
        return ;
    
    boolean canclose = org.dyndns.pamelloes.xAuthSpout.StartMenu.canClose.get(this);
    e.setCancelled((!canclose));
    if (canclose)
        org.dyndns.pamelloes.xAuthSpout.StartMenu.canClose.remove(this);
    
}