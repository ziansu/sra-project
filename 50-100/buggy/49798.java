public com.flightreservationbot.resource.skyscanner.SkyscannerCommonResource getFlights(java.lang.String message) {
    message = "2017-12-28,IST>US";
    java.lang.System.out.println("SkyscannerService.getFlights: Generating URL from message");
    java.lang.String url = parseMessageAndGenerateURL(message);
    java.lang.System.out.println(("SkyscannerService.getFlights: Generated URL from message: " + url));
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    java.lang.System.out.println("Created Rest Template Sending Package To Skyscanner Api");
    com.flightreservationbot.resource.skyscanner.SkyscannerCommonResource retVal = restTemplate.getForObject(url, com.flightreservationbot.resource.skyscanner.SkyscannerCommonResource.class);
    java.lang.System.out.println("Successfully Mapped Skyscanner Response to Object");
    return retVal;
}