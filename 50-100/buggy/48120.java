private void putXMLDisplayerIntoRequest(com.silverpeas.gallery.model.Media media, javax.servlet.http.HttpServletRequest request, com.silverpeas.gallery.control.GallerySessionController gallerySC) throws com.silverpeas.form.FormException, com.silverpeas.publicationTemplate.PublicationTemplateException {
    java.lang.String mediaId = media.getId();
    com.silverpeas.publicationTemplate.PublicationTemplate template = gallerySC.getTemplate(false);
    if (template != null) {
        com.silverpeas.form.RecordSet recordSet = template.getRecordSet();
        com.silverpeas.form.DataRecord data = recordSet.getRecord(mediaId);
        if (data != null) {
            request.setAttribute("XMLForm", template.getViewForm());
            request.setAttribute("XMLData", data);
        }
    }
}