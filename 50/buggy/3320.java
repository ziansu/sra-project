public com.brouding.simpledialog.SimpleDialog.Builder setTitle(java.lang.String message) {
    if (this.showProgress) {
        throw new java.lang.IllegalStateException("You cannot use setTitle() when you want progress SimpleDialog");
    }
    this.textTitle = message;
    this.isTitleBold = true;
    return this;
}