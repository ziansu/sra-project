public void setFormat(model.Format newFormat) {
    format = newFormat;
    processEvent(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, "changed base"));
}