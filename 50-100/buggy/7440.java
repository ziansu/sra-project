public void addCover(org.ernest.applications.dmc.report.builders.Document document, org.ernest.applications.dmc.domain.Region region) throws java.io.IOException, org.ernest.applications.dmc.report.builders.DocumentException {
    buildImage(document);
    org.ernest.applications.dmc.report.builders.Paragraph paragraph = new org.ernest.applications.dmc.report.builders.Paragraph(region.getName(), org.ernest.applications.dmc.report.builders.BuilderUtils.getTitleFont());
    paragraph.setSpacingBefore(100);
    paragraph.setAlignment(Element.ALIGN_CENTER);
    document.add(paragraph);
    document.newPage();
}