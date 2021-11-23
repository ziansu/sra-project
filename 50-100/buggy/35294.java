public void run(java.lang.String simplifiedCode, java.lang.String standardInput) {
    variableInitialization();
    code = simplifiedCode;
    inputArray = createInputArray(standardInput);
    checkForErrors();
    decode(codePosition);
    appendWarnings();
    endTime = java.lang.System.currentTimeMillis();
    codePosition = 0;
}