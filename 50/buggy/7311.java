@com.microsoft.azuretools.azurecommons.helpers.NotNull
@java.lang.Override
protected javax.swing.JComponent createEditor() {
    submissionPanel = new com.microsoft.azure.hdinsight.spark.ui.SparkSubmissionContentPanel(this.getRunConfiguration().getSubmitModel(), () -> {
    });
    return submissionPanel;
}