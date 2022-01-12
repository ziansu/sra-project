public org.opendroidphp.app.tasks.ProgressDialogTask setTitle(java.lang.String title) {
    this.title = title;
    if ((tv_title) != null) {
        tv_title.setText(title);
    }
    return this;
}