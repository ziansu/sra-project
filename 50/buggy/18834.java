@java.lang.Override
public java.lang.String toCSVString(final java.text.SimpleDateFormat sdf) {
    return java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", sdf.format(time), temperature, relativeHumidity, windSpeedMperSec, windSpeedKmh, windSpeedBft, windDirectionDegree, windDirection, windMaxGust, airPressure, visibility, weatherCode, weatherCodeText, globalRadiation);
}