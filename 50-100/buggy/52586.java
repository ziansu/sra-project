@java.lang.Override
protected fitnesse.testsystems.slim.results.SlimTestResult createEvaluationMessage(java.lang.String actual, java.lang.String expected) {
    java.lang.String cleanedActual = this.fitnesseMarkup.clean(actual);
    if (org.apache.commons.lang.StringUtils.isNotBlank(cleanedActual)) {
        try {
            this.table.addColumnToRow(getRow(), this.fitnesseMarkup.imgLink(cleanedActual));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Unexpected IO error providing screenshot for test result", e);
        }
    }
    return fitnesse.testsystems.slim.results.SlimTestResult.plain();
}