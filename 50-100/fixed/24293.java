public void openChunkWindow(java.lang.String docId, java.lang.String chunkId, org.rstudio.studio.client.workbench.views.source.editors.text.Size sourceSize) {
    org.rstudio.studio.client.workbench.views.source.editors.text.Size size = org.rstudio.studio.client.common.zoom.ZoomUtils.getZoomWindowSize(sourceSize, null);
    pSatelliteManager_.get().openSatellite(getName(docId, chunkId), org.rstudio.studio.client.workbench.views.source.editors.text.ChunkWindowParams.create(docId, chunkId), size);
}