public java.lang.String getRevisionProperty(fi.muikku.plugins.material.model.HtmlMaterial htmlMaterial, java.lang.Long revisionNumber, java.lang.String property) {
    fi.muikku.plugins.material.coops.model.HtmlMaterialRevisionProperty revisionProperty = null;
    if (revisionNumber > (htmlMaterial.getRevisionNumber())) {
        revisionProperty = htmlMaterialRevisionPropertyDAO.findByHtmlMaterialAndKeyMaxRevision(htmlMaterial, property);
    }else {
        revisionProperty = htmlMaterialRevisionPropertyDAO.findByHtmlMaterialAndKeyRevisionLeAndMaxRevision(htmlMaterial, property, htmlMaterial.getRevisionNumber());
    }
    if (revisionProperty == null) {
        return null;
    }else {
        return revisionProperty.getValue();
    }
}