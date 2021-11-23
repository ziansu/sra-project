public float get(com.s13g.winston.lib.temperature.Temperature.Unit unit) {
    if ((mUnit) == unit) {
        return mValue;
    }
    if ((unit == (com.s13g.winston.lib.temperature.Temperature.Unit.CELSIUS)) && ((mUnit) == (com.s13g.winston.lib.temperature.Temperature.Unit.FAHRENHEIT))) {
        return ((mValue) - 32) / 1.8F;
    }else
        if ((unit == (com.s13g.winston.lib.temperature.Temperature.Unit.FAHRENHEIT)) && ((mUnit) == (com.s13g.winston.lib.temperature.Temperature.Unit.CELSIUS))) {
            return ((mValue) * 1.8F) + 32;
        }
    
    throw new java.lang.RuntimeException("Unsupported temperature conversion");
}