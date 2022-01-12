protected void butNewEntry_actionPerformed(java.awt.event.ActionEvent e) {
    if (commitChanges()) {
        IdentiFrog.LOGGER.writeMessage("FrogEditor is closing with status SAVED");
        java.util.ArrayList<gov.usgs.identifrog.DataObjects.SiteImage> images = new java.util.ArrayList<gov.usgs.identifrog.DataObjects.SiteImage>();
        for (gov.usgs.identifrog.DataObjects.SiteImage img : this.frog.getAllSiteImages()) {
            img.processImageIntoDB();
            images.add(img);
        }
        dispose();
        IdentiFrog.LOGGER.writeMessage("FrogEditor has closed");
    }
}