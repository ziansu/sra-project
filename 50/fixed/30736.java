private java.lang.String setUnitOfMeasurementSelectedListValue(com.example.muresand.simpleweatherapp.util.UnitOfMeasurement unitOfMeasurement) {
    switch (unitOfMeasurement) {
        case METRIC :
            return "-1";
        case IMPERIAL :
            return "0";
        case DEFAULT :
            return "1";
        default :
            return "-1";
    }
}