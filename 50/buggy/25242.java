public void smlUpload(org.primefaces.event.FileUploadEvent event) {
    smlUploaded = event.getFile();
    this.sendFileUploadSuccessMessage(smlUploaded.getFileName());
}