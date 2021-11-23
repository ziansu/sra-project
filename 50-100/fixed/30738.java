public conversation_test.Address vaildate() {
    java.lang.String googleMapURL = buildGoogleMapsURL();
    java.lang.String googleAddressResponse = getGoogleMapResponse(googleMapURL);
    processGoogleResponse(googleAddressResponse);
    java.lang.String yAddressURL = buildYaddressURL();
    java.lang.System.out.println(yAddressURL);
    java.lang.String yAddressResponse = getYaddressResponse(yAddressURL);
    processyAddressResponse(yAddressResponse);
    return address;
}