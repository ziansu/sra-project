public static void store() {
    try (java.io.OutputStream fos = new java.io.FileOutputStream(jloda.util.ProgramProperties.getDefaultFileName())) {
        jloda.util.ProgramProperties.props.store(fos, jloda.util.ProgramProperties.programName);
    } catch (java.lang.Exception ex) {
    }
}