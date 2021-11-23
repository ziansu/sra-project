public com.brouding.simpledialog.SimpleDialog.Builder setProgressGIF(java.lang.Object customProgressGIF) {
    if ((this.customView) != null) {
        throw new java.lang.IllegalStateException("You cannot use showProgress() when you want customView");
    }
    this.showProgress = true;
    this.customProgressGIF = customProgressGIF;
    return this;
}