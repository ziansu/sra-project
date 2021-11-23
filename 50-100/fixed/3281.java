private void deletePDF(java.lang.String filePath) throws com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    try {
        java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get(filePath));
    } catch (java.io.IOException e) {
        com.at.ac.tuwien.sepm.ss15.edulium.service.impl.PrinterInvoiceManager.LOGGER.error("An I/O error occurred while trying to delete the PDF", e);
        throw new com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException("An I/O error occurred while trying to delete the PDF", e);
    }
}