public void print() {
    deselectBox();
    deselectRelation();
    javafx.print.PrinterJob job = javafx.print.PrinterJob.createPrinterJob();
    if (job == null) {
        warning("No printer found");
        return ;
    }
    if (job.showPrintDialog(null)) {
        noBG();
        job.printPage(workspace);
        hideGrid();
    }
    job.endJob();
}