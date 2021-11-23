public java.lang.String getSourceCode(java.lang.String expectedSourceCode) {
    if ((body.getText().indexOf(expectedSourceCode)) >= 0)
        return expectedSourceCode;
    
    return "*** NOT FOUND ***";
}