private void showDownloadButton(boolean visible) {
    if (visible) {
        if ((context) != null) {
            org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.interactors.raw.RawInteractor> interactors = context.getInteractors().getRawInteractorsPerResource(selectedResource);
            if (hasContents(interactors)) {
                downloadBtn.setVisible(true);
            }else {
                downloadBtn.setVisible(false);
            }
        }
    }else {
        downloadBtn.setVisible(false);
    }
}