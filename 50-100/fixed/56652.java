public void send(java.lang.String message) {
    if ((message == null) || ("".equals(message))) {
        throw new java.lang.IllegalArgumentException();
    }
    if (message.equals(tddmicroexercises.telemetrysystem.TelemetryClient.DIAGNOSTIC_MESSAGE)) {
        diagnosticMessageJustSent = true;
    }else {
        diagnosticMessageJustSent = false;
    }
}