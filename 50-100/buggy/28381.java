public java.lang.Float getTemperatureFeelsLike() {
    if ((temperature) < 10) {
        return new java.lang.Float((((13.12 + (0.6215 * (temperature))) - (13.956 * (java.lang.Math.pow(windSpeed, 0.16)))) + ((0.4867 * (temperature)) * (java.lang.Math.pow(windSpeed, 0.16)))));
    }
    return temperature;
}