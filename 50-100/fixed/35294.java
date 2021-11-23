public void run(java.lang.String simplifiedCode, java.lang.String standardInput) {
    code = simplifiedCode;
    inputArray = createInputArray(standardInput);
    checkForErrors();
    startTime = java.lang.System.currentTimeMillis();
    decode(codePosition);
    appendWarnings();
    endTime = java.lang.System.currentTimeMillis();
}