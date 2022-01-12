private void populate() {
    label.setText(((java.lang.String) (fileStruct.getValue("name"))));
    switch (fileStruct.getType()) {
        case FILE :
            image.setImage(edu.wright.cs.jfiles.gui.common.FileIconViewController.fileImage);
            break;
        case DIRECTORY :
            image.setImage(edu.wright.cs.jfiles.gui.common.FileIconViewController.directoryImage);
            break;
        default :
            image.setImage(edu.wright.cs.jfiles.gui.common.FileIconViewController.fileImage);
    }
}