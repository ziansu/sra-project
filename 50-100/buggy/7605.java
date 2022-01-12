public void removeLink(com.aleksey.castlegates.types.GearLink link) {
    if (link == null)
        return ;
    
    link.setRemoved();
    link.getGear1().setLink(null);
    link.getGear2().setLink(null);
    this.dataWorker.addChangedLink(link);
}