protected static at.skobamg.generator.model.IInterface parseInterface(org.w3c.dom.Element element) {
    if (element.hasAttribute(IInterface.propertyPortRange))
        return new at.skobamg.generator.model.Interface(element.getAttribute(IInterface.propertyPortBezeichnunglang), element.getAttribute(IInterface.propertyPortBezeichnungkurz), element.getAttribute(IInterface.propertyPortRange));
    else
        return new at.skobamg.generator.model.Interface(element.getAttribute(IInterface.propertyPortBezeichnunglang), element.getAttribute(IInterface.propertyPortBezeichnungkurz));
    
}