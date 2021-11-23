@java.lang.Override
public aQute.maven.provider.POM getPom(java.io.InputStream pomFile) throws java.lang.Exception {
    return new aQute.maven.provider.POM(this, pomFile);
}