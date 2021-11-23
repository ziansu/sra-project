private java.lang.String buildDefaultPackingInfo(final de.metas.process.IProcessPreconditionsContext context) {
    final de.metas.handlingunits.model.I_M_ReceiptSchedule receiptSchedule = context.getSelectedModel(de.metas.handlingunits.model.I_M_ReceiptSchedule.class);
    if (receiptSchedule == null) {
        return null;
    }
    final de.metas.handlingunits.model.I_M_HU_LUTU_Configuration lutuConfig = getCurrentLUTUConfiguration(receiptSchedule);
    de.metas.ui.web.handlingunits.process.WEBUI_M_ReceiptSchedule_GeneratePlanningHUs_UsingDefaults.adjustLUTUConfiguration(lutuConfig, receiptSchedule);
    return de.metas.ui.web.handlingunits.util.HUPackingInfoFormatter.newInstance().setShowLU(false).format(de.metas.ui.web.handlingunits.util.HUPackingInfos.of(lutuConfig));
}