@java.lang.Override
protected void updateItem(application.DataSet t, boolean bln) {
    super.updateItem(t, bln);
    if (t != null) {
        setText(t.getFilePath().substring(application.services.GeneralService.getDataSetDirectory().length()));
    }else {
        setText("Choose...");
    }
}