private static void processColorSpace(org.verapdf.model.factory.operators.GraphicState graphicState, org.verapdf.model.impl.pd.util.PDResourcesHandler resourcesHandler, org.verapdf.pd.colors.PDColorSpace defaultCS, org.verapdf.as.ASAtom name, boolean stroke) {
    org.verapdf.pd.colors.PDColorSpace colorSpace = resourcesHandler.getColorSpace(name);
    if (colorSpace == null) {
        colorSpace = defaultCS;
    }
    if (stroke) {
        graphicState.setStrokeColorSpace(colorSpace);
    }else {
        graphicState.setFillColorSpace(colorSpace);
    }
}