protected java.lang.String clean(java.lang.String value) {
    if (!(appendTimestamp)) {
        return idProvider.readId(cleanValue);
    }
    java.lang.String timeStamp = "";
    java.lang.String cleanValue = value;
    int separatorIndex = value.lastIndexOf(com.amadeus.session.servlet.BaseSessionTracking.SESSION_ID_TIMESTAMP_SEPARATOR);
    if (separatorIndex != (-1)) {
        timeStamp = value.substring(separatorIndex);
        cleanValue = value.substring(0, separatorIndex);
    }
    cleanValue = idProvider.readId(cleanValue);
    return cleanValue != null ? cleanValue + timeStamp : cleanValue;
}