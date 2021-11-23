private void printErrorMessage(java.lang.String message, int index, int underlineLength) {
    java.lang.System.out.println(mCommand);
    printUnderLine(getPosition(index), underlineLength);
    java.lang.System.out.println(message);
}