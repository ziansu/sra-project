protected void wrapUpTestCase() {
    if ((currentTestCase) == null)
        return ;
    
    currentTestCase.report();
    currentTestCase = null;
}