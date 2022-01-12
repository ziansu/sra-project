private void printErrorMessage(java.lang.String message) {
    java.lang.System.out.println(mCommand);
    int underlineLength = (mTokenEnded) ? 1 : mTokens.get(mIndex).length();
    printUnderLine(getPosition(mIndex), underlineLength);
    java.lang.System.out.println(message);
}