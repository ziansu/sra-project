@java.lang.Override
public boolean execute(org.apache.commons.cli.CommandLine cmd) throws java.lang.Exception {
    java.lang.String metadata = Gateway.storage.getPropertyMetadata(cmd.getOptionValue(name).toUpperCase(), "creator");
    java.lang.System.out.println(("Creator metadata: " + metadata));
    return true;
}