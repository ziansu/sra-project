private void jButtonCrowdMouseClicked(java.awt.event.MouseEvent evt) {
    arenatojava.SQL sql = new arenatojava.SQL();
    currentCrowd = sql.getCrowdInfo();
    try {
        if ((currentImage) != null)
            currentImage = converter.Resize(((java.awt.image.BufferedImage) (currentImage)), currentCrowd.getWidth(), currentCrowd.getHeight());
        
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(arenatojava.MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    UpdateImageView();
}