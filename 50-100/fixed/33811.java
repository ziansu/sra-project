public static org.newdawn.slick.Image getIconImage(int id) {
    int i = ((id < 0) || (id >= (itdelatrisu.opsu.user.UserButton.getIconCount()))) ? 0 : id;
    return GameImage.USER.getImages()[i].getScaledCopy(itdelatrisu.opsu.user.UserButton.iconSize, itdelatrisu.opsu.user.UserButton.iconSize);
}