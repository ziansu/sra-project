@java.lang.Override
public boolean matches(final org.apache.camel.Exchange exchange) {
    final uk.nhs.ciao.dts.ControlFile controlFile = exchange.getIn().getBody(uk.nhs.ciao.dts.ControlFile.class);
    if ((controlFile == null) || (com.google.common.base.Strings.isNullOrEmpty(controlFile.getWorkflowId()))) {
        return false;
    }
    return !(workflowIds.contains(controlFile.getWorkflowId()));
}