private static savagerifts.model.sheet.Roll getMinAttribute(savagerifts.model.sheet.Sheet sheet, savagerifts.model.AttributeType type) {
    if (((sheet.getFramework()) != null) && ((framework.getStartingAttribute(type)) != null)) {
        return framework.getStartingAttribute(type);
    }
    return new savagerifts.model.sheet.Roll();
}