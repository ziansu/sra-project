public java.lang.String formatExcRate(float l) {
    if (l < 1) {
        ExcRateFormat.applyPattern("#,###.########");
    }else {
        ExcRateFormat.applyPattern("#,###.##");
    }
    return ExcRateFormat.format(l);
}