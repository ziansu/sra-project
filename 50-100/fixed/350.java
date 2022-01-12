@java.lang.Override
public java.awt.image.BufferedImage getImage() {
    if (up) {
        if (((count) >= 0) && ((count) < 5))
            return bsprite[0];
        else
            return bsprite[1];
        
    }else {
        if (((count) >= 0) && ((count) < 5))
            return fsprite[0];
        else
            return fsprite[1];
        
    }
}