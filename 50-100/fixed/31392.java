private static savagerifts.model.sheet.Roll getMaxAttribute(savagerifts.model.sheet.Sheet sheet, savagerifts.model.AttributeType type) {
    if (((sheet.getFramework()) != null) && ((sheet.getFramework().getMaxAttribute(type)) != null)) {
        return sheet.getFramework().getMaxAttribute(type);
    }
    return new savagerifts.model.sheet.Roll(savagerifts.model.DieType.D12, 0);
}