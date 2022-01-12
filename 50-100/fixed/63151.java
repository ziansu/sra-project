@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setExportImagesPlusText(imagesPlusTextBtn.getSelection());
    if (imagesPlusTextBtn.getSelection()) {
        setExportImagesOnly(false);
        imagesOnlyBtn.setSelection(false);
    }else {
        setExportImagesPlusText(true);
        imagesPlusTextBtn.setSelection(true);
    }
}