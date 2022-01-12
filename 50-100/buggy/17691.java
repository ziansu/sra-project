public void setAttached(proto.game.world.Element other, boolean is) {
    final proto.game.world.Element oldP = other.attachedTo;
    attached.toggleMember(other, is);
    other.attachedTo = (is) ? this : null;
    if ((is && (oldP != null)) && (oldP != (this)))
        oldP.setAttached(other, false);
    
}