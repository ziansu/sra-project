double getNonTimeMaxValue() {
    if (nonTimeAxisMaxCurrent.isSelected()) {
        return nonTimeAxisMaxCurrentValue.getValue().floatValue();
    }else
        if (nonTimeAxisMaxManual.isSelected()) {
            double result = 1.0;
            try {
                result = nonTimeAxisMaxManualValue.getDoubleValue().floatValue();
            } catch (java.text.ParseException e) {
                gov.nasa.arc.mct.fastplot.view.PlotSettingsControlPanel.logger.error("Plot control panel: Could not read the non-time axis' maximum manual value");
            }
            return result;
        }else
            if (nonTimeAxisMaxAutoAdjust.isSelected()) {
                return nonTimeAxisMaxAutoAdjustValue.getValue().floatValue();
            }
        
    
    return 1.0;
}