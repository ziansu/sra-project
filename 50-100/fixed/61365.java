static java.lang.String printOutStepSize(int startingNumber, int upperBound, int stepSize) {
    int temporaryNumber = startingNumber;
    java.lang.StringBuilder returnMessage = new java.lang.StringBuilder();
    while (temporaryNumber < upperBound) {
        java.lang.System.out.print((temporaryNumber + " "));
        returnMessage.append((temporaryNumber + " "));
        temporaryNumber = temporaryNumber + stepSize;
    } 
    return java.lang.String.valueOf(returnMessage);
}