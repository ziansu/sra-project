public static org.kentuni.WeatherStation.Drivers.MCP3427 getDriver() throws java.io.IOException {
    if ((org.kentuni.WeatherStation.Drivers.ADC.instance) == null) {
        synchronized(org.kentuni.WeatherStation.Drivers.ADC.class) {
            if ((org.kentuni.WeatherStation.Drivers.ADC.instance) == null) {
                org.kentuni.WeatherStation.Drivers.ADC.instance = new org.kentuni.WeatherStation.Drivers.MCP3427(com.pi4j.io.i2c.I2CFactory.getInstance(I2CBus.BUS_1, 105));
            }
        }
    }
    return org.kentuni.WeatherStation.Drivers.ADC.instance;
}