public org.mobicents.servlet.restcomm.entities.Geolocation setDateUpdated(org.joda.time.DateTime dateUpdated) {
    java.lang.System.out.println(("setDateUpdated (Geolocation): " + dateUpdated));
    return new org.mobicents.servlet.restcomm.entities.Geolocation(sid, dateCreated, dateUpdated, dateExecuted, accountSid, source, deviceIdentifier, geolocationType, responseStatus, cellId, locationAreaCode, mobileCountryCode, mobileNetworkCode, networkEntityAddress, ageOfLocationInfo, deviceLatitude, deviceLongitude, accuracy, physicalAddress, internetAddress, formattedAddress, locationTimestamp, eventGeofenceLatitude, eventGeofenceLongitude, radius, geolocationPositioningType, lastGeolocationResponse, cause, apiVersion, uri);
}