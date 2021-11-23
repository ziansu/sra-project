@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setExportImagesOnly(imagesOnlyBtn.getSelection());
    if (imagesOnlyBtn.getSelection()) {
        setExportImagesPlusText(false);
        imagesPlusTextBtn.setSelection(false);
    }else {
        if (!(isExportImagesPlusText())) {
            setExportImagesPlusText(true);
            imagesPlusTextBtn.setSelection(true);
        }
    }
}