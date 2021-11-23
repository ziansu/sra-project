public boolean tryTests() {
    if ((testResult) != null)
        return (testResult.getNumberOfFailedTests()) == 0;
    
    return false;
}