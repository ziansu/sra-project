@java.lang.Override
public java.lang.String toCSVString() {
    return java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", time.toString(), temperature, relativeHumidity, windSpeedMperSec, windSpeedKmh, windSpeedBft, windDirectionDegree, windDirection, windMaxGust, airPressure, visibility, weatherCode, weatherCodeText, globalRadiation);
}