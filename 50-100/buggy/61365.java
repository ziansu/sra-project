static java.lang.String printOutStepSize(int startingNumber, int upperBound, int stepSize) {
    int temporaryNumber = startingNumber;
    java.lang.StringBuilder returnMessage = new java.lang.StringBuilder();
    while (startingNumber < upperBound) {
        java.lang.System.out.print((startingNumber + " "));
        returnMessage.append((startingNumber + " "));
        startingNumber = startingNumber + stepSize;
    } 
    return java.lang.String.valueOf(returnMessage);
}