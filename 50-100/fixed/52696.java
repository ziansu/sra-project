private java.lang.String ExecuteCommand(java.lang.String FullCommand) {
    java.lang.String output = null;
    try {
        if (FullCommand != null)
            output = cli.send(FullCommand);
        
    } catch (final com.ericsson.commonlibrary.remotecli.exceptions.ReadTimeoutException e) {
        java.lang.System.out.println("Took to long to find prompt");
    } catch (final com.ericsson.commonlibrary.remotecli.exceptions.ReadException e) {
        java.lang.System.out.println("Failed to find prompt");
    } catch (final com.ericsson.commonlibrary.remotecli.exceptions.WriteException e) {
        java.lang.System.out.println("Failed to send");
    } catch (final com.ericsson.commonlibrary.remotecli.exceptions.RemoteCliException e) {
        java.lang.System.out.println("Other unknown error");
    }
    return output;
}