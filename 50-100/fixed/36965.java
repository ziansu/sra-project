public java.lang.String getUpdatedDestinationNumber(java.lang.String destinationAddress) {
    java.lang.String otherPartyData = destinationAddress;
    if ((otherPartyData != null) && ((otherPartyData.length()) >= 7)) {
        if (otherPartyData.matches("0")) {
            if (otherPartyData.matches("^[0][1-9].*")) {
                otherPartyData = otherPartyData.replaceAll("^0", "0084");
            }else {
                otherPartyData = "00" + otherPartyData;
            }
        }else {
            otherPartyData = "00" + otherPartyData;
        }
    }
    return otherPartyData;
}