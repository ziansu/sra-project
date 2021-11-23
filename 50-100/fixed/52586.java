@java.lang.Override
protected fitnesse.testsystems.slim.results.SlimTestResult createEvaluationMessage(java.lang.String actual, java.lang.String expected) {
    java.lang.String cleanedActual = this.fitnesseMarkup.clean(actual);
    if (org.apache.commons.lang.StringUtils.isNotBlank(cleanedActual)) {
        this.table.addColumnToRow(getRow(), this.fitnesseMarkup.imgLink(cleanedActual));
    }
    return fitnesse.testsystems.slim.results.SlimTestResult.plain();
}