private void printerSelection() {
    int printer_selection = MainActivity.mSp.getInt("PRINTER_SELECTION", 0);
    if (printer_selection == (AppConsts.THREE_INCH)) {
        rbThreeInch.setChecked(true);
        mPrinter.setPrinterWidth(PrinterWidth.PRINT_WIDTH_72MM);
    }
    if (printer_selection == (AppConsts.FOUR_INCH)) {
        rbFourInch.setChecked(true);
        mPrinter.setPrinterWidth(PrinterWidth.PRINT_WIDTH_104MM);
    }
    if (printer_selection == (AppConsts.TWO_INCH)) {
        rbTwoInch.setChecked(true);
        mPrinter.setPrinterWidth(PrinterWidth.PRINT_WIDTH_48MM);
    }
}