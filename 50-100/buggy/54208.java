private void logAndPrint(qz.PrintPostScript printPS) throws java.awt.print.PrinterException {
    logCommands((("    <<" + (file)) + ">>"));
    if ((paperSize) != null) {
        printPS.setPaperSize(paperSize);
    }
    if ((copies) > 1) {
        printPS.setCopies(copies);
    }
    printPS.print();
    psPrint = false;
}