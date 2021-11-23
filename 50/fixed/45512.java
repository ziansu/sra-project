@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    options.processingOptions.getValuesViaDialog();
    nimgDisplay = new fntd.display.FNTDdisplay(nimg, ft, options);
    nimgDisplay.show();
}