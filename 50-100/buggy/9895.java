public boolean accept(java.io.File pathname) {
    if (pathname.getName().contains(EInternalTemplate.HEADER_ADDITIONAL.toString()))
        if (pathname.getName().contains(((language.getExtension()) + (org.talend.designer.codegen.config.TemplateUtil.TEMPLATE_EXT))))
            return true;
        
    
    return false;
}