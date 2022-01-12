private void parseDigitalInput(java.util.List<ch.desm.middleware.app.core.communication.endpoint.ubw32.EndpointUbw32Message> result, java.lang.String[] commandParts, java.lang.String response) {
    java.lang.String[] responseParts = response.split(",");
    if ((responseParts.length) != 2) {
        throw new java.lang.RuntimeException("Invalid number of PI response parts");
    }
    final ch.desm.middleware.app.core.communication.endpoint.ubw32.EndpointUbw32Register pin = parsePin(commandParts[1], commandParts[2]);
    final java.lang.Boolean pinValue = responseParts[1].equals("1");
    result.add(new ch.desm.middleware.app.core.communication.endpoint.ubw32.EndpointUbw32MessageDigital(pin, pinValue));
}