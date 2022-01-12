public void processTextUnit(net.sf.okapi.common.resource.ITextUnit textUnit) {
    java.lang.String skeletonString = "";
    if ((textUnit.getSkeleton()) != null) {
        skeletonString = textUnit.getSkeleton().toString();
    }
    for (net.sf.okapi.common.resource.TextPart part : textUnit.getSource().getParts()) {
        markerHelper.manageCodes(part.getContent(), textUnit.getId(), skeletonMap, textUnitList, skeletonString, textUnit.getType());
    }
}