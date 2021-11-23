private static savagerifts.model.sheet.Roll getMinAttribute(savagerifts.model.sheet.Sheet sheet, savagerifts.model.AttributeType type) {
    if (((sheet.getFramework()) != null) && ((sheet.getFramework().getStartingAttribute(type)) != null)) {
        return sheet.getFramework().getStartingAttribute(type);
    }
    return new savagerifts.model.sheet.Roll();
}