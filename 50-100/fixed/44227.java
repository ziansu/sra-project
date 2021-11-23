double getNonTimeMaxValue() {
    if (nonTimeAxisMaxCurrent.isSelected()) {
        return nonTimeAxisMaxCurrentValue.getValue().floatValue();
    }else
        if (nonTimeAxisMaxManual.isSelected()) {
            double result = 1.0;
            try {
                result = nonTimeAxisMaxManualValue.getDoubleValue().floatValue();
            } catch (java.text.ParseException e) {
                return 1.0;
            }
            return result;
        }else
            if (nonTimeAxisMaxAutoAdjust.isSelected()) {
                return nonTimeAxisMaxAutoAdjustValue.getValue().floatValue();
            }
        
    
    return 1.0;
}