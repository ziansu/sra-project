private void viewPDF(java.lang.String filePath) throws com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    if (java.awt.Desktop.isDesktopSupported()) {
        java.io.File file = new java.io.File(filePath);
        try {
            java.awt.Desktop.getDesktop().open(file);
        } catch (java.io.IOException e) {
            com.at.ac.tuwien.sepm.ss15.edulium.service.impl.PrinterInvoiceManager.LOGGER.error("No application registered for PDFs");
        }
    }
}