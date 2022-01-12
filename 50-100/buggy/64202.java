private java.lang.String printSOAPResponse(java.lang.String type, javax.xml.soap.SOAPMessage soapResponse) throws java.lang.Exception {
    java.lang.String returnMessage = "";
    switch (type) {
        case "Login" :
            returnMessage = com.deloitte.classes.soap.SoapLogin.InterpreteBody(soapResponse.getSOAPBody());
            break;
        case "Notification" :
            notification = com.deloitte.classes.soap.SoapNotification.InterpreteBody(soapResponse.getSOAPBody());
            break;
        case "Tracking" :
            truckList = com.deloitte.classes.soap.SoapTracking.InterpreteBody(soapResponse.getSOAPBody());
            break;
    }
    return returnMessage;
}