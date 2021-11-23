private org.zaproxy.zap.utils.ZapNumberSpinner getMaxPayloadsNumberSpinner() {
    if ((maxPayloadsNumberSpinner) == null) {
        maxPayloadsNumberSpinner = new org.zaproxy.zap.utils.ZapNumberSpinner(1, org.zaproxy.zap.extension.fuzz.payloads.ui.impl.RegexPayloadGeneratorUIHandler.RegexPayloadGeneratorUIPanel.DEFAULT_MAX_PAYLOADS, java.lang.Integer.MAX_VALUE);
        maxPayloadsNumberSpinner.setToolTipText(org.zaproxy.zap.extension.fuzz.payloads.ui.impl.RegexPayloadGeneratorUIHandler.RegexPayloadGeneratorUIPanel.MAX_PAYLOADS_FIELD_TOOL_TIP);
    }
    return maxPayloadsNumberSpinner;
}