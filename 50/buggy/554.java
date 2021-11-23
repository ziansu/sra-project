public boolean inBarCollapseZone(com.badlogic.gdx.math.Rectangle itemRect) {
    if ((refButton) != null) {
        if (refButton.hideBarRect.overlaps(itemRect))
            return true;
        
    }
    return false;
}