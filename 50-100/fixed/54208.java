private void logAndPrint(qz.PrintPostScript printPS) throws java.awt.print.PrinterException {
    logCommands((("    <<" + (file)) + ">>"));
    if ((paperSize) != null) {
        printPS.setPaperSize(paperSize);
    }
    if ((copies) > 0) {
        printPS.setCopies(copies);
    }else {
        printPS.setCopies(1);
    }
    printPS.print();
    psPrint = false;
}