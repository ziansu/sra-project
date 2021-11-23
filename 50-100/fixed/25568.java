@java.lang.Override
public void performOperation(org.gzipper.java.application.ArchiveOperation operation) {
    if (((_outputFile) != null) && (!(org.gzipper.java.application.util.ListUtils.isNullOrEmpty(_selectedFiles)))) {
        super.performOperation(operation);
    }else {
        org.gzipper.java.util.Log.e("Operation cannot be started as an invalid path has been specified.");
        org.gzipper.java.util.Log.w(org.gzipper.java.i18n.I18N.getString("outputPathWarning.text"), true);
        _outputPathTextField.requestFocus();
    }
}