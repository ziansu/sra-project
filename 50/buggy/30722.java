@java.lang.Override
public hudson.model.ParameterValue createValue(hudson.cli.CLICommand command, java.lang.String value) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] requestValues = (value != null) ? value.split(",") : null;
    return createValue(requestValues);
}