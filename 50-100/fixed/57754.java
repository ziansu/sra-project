public boolean isCreateable() {
    return ((((((creatable) != null) && ((direction) != null)) && (!(Createable.ERROR.equals(creatable)))) && (!(Direction.ERROR.equals(direction)))) && ((message.getPlayer().getLocation().getOutboundLink(direction)) == null)) && (!((Createable.LOCATION.equals(creatable)) && ((direction) == null)));
}