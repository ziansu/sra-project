public void removeLink(com.aleksey.castlegates.types.GearLink link) {
    if (link == null)
        return ;
    
    link.setRemoved();
    if ((link.getGear1()) != null) {
        link.getGear1().setLink(null);
    }
    if ((link.getGear2()) != null) {
        link.getGear2().setLink(null);
    }
    this.dataWorker.addChangedLink(link);
}