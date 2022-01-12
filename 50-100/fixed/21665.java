private java.util.Optional<address.model.AddressBook> getMirrorData() throws address.exceptions.FileContainsDuplicatesException {
    java.lang.System.out.println(("Updating data from cloud: " + (java.lang.System.nanoTime())));
    final java.io.File mirrorFile = address.prefs.PrefsManager.getInstance().getMirrorLocation();
    final java.util.Optional<address.model.AddressBook> data = cloudSimulator.getSimulatedCloudData(mirrorFile);
    if ((data.isPresent()) && (data.get().containsDuplicates()))
        throw new address.exceptions.FileContainsDuplicatesException(mirrorFile);
    
    return data;
}