public static float convertTemperature(float temperature, android.content.SharedPreferences sp) {
    if (sp.getString("unit", "C").equals("°C")) {
        return cz.martykan.forecastie.utils.UnitConvertor.kelvinToCelsius(temperature);
    }else
        if (sp.getString("unit", "C").equals("°F")) {
            return cz.martykan.forecastie.utils.UnitConvertor.kelvinToFahrenheit(temperature);
        }else {
            return temperature;
        }
    
}