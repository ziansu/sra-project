@java.lang.Override
public boolean isDisabled(java.lang.String layerName) {
    uk.ac.rdg.resc.edal.catalogue.jaxb.VariableConfig xmlVariable = getXmlVariable(layerName);
    if (xmlVariable != null) {
        xmlVariable.isDisabled();
    }else {
        uk.ac.rdg.resc.edal.ncwms.config.NcwmsDynamicService dynamicService = getDynamicServiceFromLayerName(layerName);
        if (dynamicService != null) {
            return dynamicService.isDisabled();
        }
    }
    return true;
}