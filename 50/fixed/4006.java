@java.lang.Override
public fi.muikku.plugins.material.model.HtmlMaterial clone(fi.muikku.plugins.material.model.HtmlMaterial material) {
    return htmlMaterialController.createHtmlMaterial(material.getTitle(), material.getHtml(), material.getContentType(), new java.lang.Long(0), material);
}