public static void recalculateAttributes(savagerifts.model.sheet.Sheet sheet) {
    if (!(sheet.getCreationStep().isBefore(SheetCreationStep.ATTRIBUTES))) {
        return ;
    }
    sheet.setRemainingAttrPoints(savagerifts.util.SheetUtils.getMaxAttributePoints(sheet));
    for (savagerifts.model.AttributeType type : savagerifts.model.AttributeType.values()) {
        sheet.getAttribute(type).copy(savagerifts.util.SheetUtils.getMinAttribute(sheet, type));
    }
}