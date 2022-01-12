public void markAsFault() {
    br.usp.each.saeg.road2fault.extractor.model.XmlPackage pkg = getPackageByName(faultInfo.getFaultyPackage());
    br.usp.each.saeg.road2fault.extractor.model.XmlClass clz = pkg.getClassByName(faultInfo.getFaultyClass());
    br.usp.each.saeg.road2fault.extractor.model.XmlMethod method = clz.getMethodByName(faultInfo.getFaultyMethod());
    method.setFault();
    br.usp.each.saeg.road2fault.extractor.model.XmlBlock block = method.getBlockById(faultInfo.getFaultyBlock());
    block.setFault();
}