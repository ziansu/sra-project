double getNonTimeMinValue() {
    if (nonTimeAxisMinCurrent.isSelected()) {
        return nonTimeAxisMinCurrentValue.getValue().floatValue();
    }else
        if (nonTimeAxisMinManual.isSelected()) {
            double result = 0.0;
            try {
                result = nonTimeAxisMinManualValue.getDoubleValue().floatValue();
            } catch (java.text.ParseException e) {
                gov.nasa.arc.mct.fastplot.view.PlotSettingsControlPanel.logger.error("Plot control panel: Could not read the non-time axis' minimum manual value");
            }
            return result;
        }else
            if (nonTimeAxisMinAutoAdjust.isSelected()) {
                return nonTimeAxisMinAutoAdjustValue.getValue().floatValue();
            }
        
    
    return 0.0;
}