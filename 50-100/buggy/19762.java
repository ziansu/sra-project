private void sendEmailWithPDF(final java.lang.String email) {
    mailHelper = new com.bionic.kvt.serviceapp.helpers.MailHelper();
    mailHelper.setRecipient(email);
    mailHelper.setMessageBody("This is a PDF report");
    mailHelper.setSubject("PDF_Report");
    mailHelper.setFullFileName(pdfReportFile.toString());
    getSupportLoaderManager().restartLoader(com.bionic.kvt.serviceapp.activities.PDFReportActivity.MAIL_LOADER_ID, null, this);
}