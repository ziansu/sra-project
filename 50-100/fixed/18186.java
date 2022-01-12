public static boolean sameColor(java.awt.Color c1, java.awt.Color c2) {
    if ((c1 == null) ^ (c2 == null))
        return false;
    
    return (((c1.getRed()) == (c2.getRed())) && ((c1.getGreen()) == (c2.getGreen()))) && ((c1.getBlue()) == (c2.getBlue()));
}