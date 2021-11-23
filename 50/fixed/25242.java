public void smlUpload(org.primefaces.event.FileUploadEvent event) {
    this.smlUploaded = event.getFile();
    this.sendFileUploadSuccessMessage(smlUploaded.getFileName());
}