private void highlightArrow(uk.ac.cam.teamdelta.Direction d) {
    javafx.scene.image.ImageView iv = navMap.get(d);
    if (iv == null) {
        uk.ac.cam.teamdelta.Logger.error((("NULL IV - direction" + (d.getDegrees())) + " was not in direction set"));
    }
    iv.setImage(hArrow);
}