public void execute() throws java.io.IOException {
    all = ((java.util.LinkedHashMap) (loadAllMethods()));
    concatTests();
    getTimes();
    getMeasures();
    getTrace();
    generateResults();
}