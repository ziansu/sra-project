protected com.vaadin.server.FileDownloader prepareStream(com.vaadin.server.StreamResource streamResource) {
    streamResource.setCacheTime(5000);
    streamResource.setMIMEType("application/pdf");
    com.vaadin.server.FileDownloader fd = new com.vaadin.server.FileDownloader(streamResource);
    return fd;
}