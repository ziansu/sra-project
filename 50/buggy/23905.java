@java.lang.Override
public void requestDestinationTile(models.ctrlCommand.CTRLCommand callbackObject) {
    this.currentCommand = callbackObject;
    java.lang.System.out.println(("Requesting requestTile(). Set callback CTRLCommand to " + (callbackObject.hashCode())));
    this.destinationTile = null;
    msgGen.requestTile(currentInstance);
}