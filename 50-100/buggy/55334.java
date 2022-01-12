@java.lang.Override
public void save(stamboom.domain.Administratie admin) throws java.io.IOException {
    if (!(isCorrectlyConfigured())) {
        throw new java.lang.RuntimeException("Serialization mediator isn't initialized correctly.");
    }
    try {
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream(props.getProperty("file"));
        java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
        out.writeObject(admin);
        out.close();
        fileOut.close();
        java.lang.System.out.printf("File has been saved to \"data.ser\"");
    } catch (java.io.IOException i) {
        i.toString();
    }
}