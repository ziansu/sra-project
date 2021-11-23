public static org.newdawn.slick.Image getIconImage(int id) {
    if ((id < 0) || (id >= (itdelatrisu.opsu.user.UserButton.getIconCount())))
        return null;
    
    return GameImage.USER.getImages()[id].getScaledCopy(itdelatrisu.opsu.user.UserButton.iconSize, itdelatrisu.opsu.user.UserButton.iconSize);
}