@java.lang.Override
public void createPdf(boolean isBuyer, com.itextpdf.text.Document doc) throws com.itextpdf.text.DocumentException, java.io.IOException {
    if (isBuyer) {
        pdf.createPdfCardsBuyer(doc, kms.getCards(), kms.getAssistantCount(), kms.getConfiguration().getFirstID());
    }else {
        pdf.createPdfCardsSeller(doc, kms.getCards(), kms.getAssistantCount(), kms.getConfiguration().getFirstID());
    }
    jKMS.LogicHelper.print("PDF Created!");
}