@java.lang.Override
protected void updateItem(application.DataSet t, boolean bln) {
    java.lang.System.out.println("Calling setButtonCell");
    super.updateItem(t, bln);
    if (t != null) {
        java.lang.System.out.println(("IN SBC Setting text to: " + (t.getFilePath().substring(application.services.GeneralService.getDataSetDirectory().length()))));
        setText(t.getFilePath().substring(application.services.GeneralService.getDataSetDirectory().length()));
    }else {
        java.lang.System.out.println("IN SBC Setting text to: Choose...");
        setText("Choose...");
    }
}