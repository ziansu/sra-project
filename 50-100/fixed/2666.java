private void setCssFilePath(fi.mystes.synapse.mediator.PdfMediator mediator, org.apache.axiom.om.OMElement pdf) {
    org.apache.axiom.om.OMElement cssFilePath = fac.createOMElement("cssFilePath", synNS, pdf);
    if ((mediator.getCssFilePathExpression()) != null) {
        org.apache.synapse.config.xml.SynapseXPathSerializer.serializeXPath(mediator.getCssFilePathExpression(), cssFilePath, "expression");
    }else {
        cssFilePath.addAttribute(fac.createOMAttribute("value", nullNS, mediator.getCssFilePath()));
    }
}