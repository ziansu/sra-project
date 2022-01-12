private void insertCell(com.itextpdf.text.pdf.PdfPTable table, java.lang.String text, int align, int colspan, com.itextpdf.text.Font font) {
    com.itextpdf.text.pdf.PdfPCell cell = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(text.trim(), font));
    cell.setHorizontalAlignment(align);
    cell.setColspan(colspan);
    if (text.trim().equalsIgnoreCase("")) {
        cell.setMinimumHeight(10.0F);
    }
    table.addCell(cell);
}