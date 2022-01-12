@org.junit.Test
public void showURLComponents1() throws java.io.IOException, java.net.URISyntaxException {
    testURI2URL("jar:file:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", "jar:file:/usr/local/projects/JOGL/gluegen/build-x86_64 öä lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", true);
    testURI2URL("jar:file:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/", "jar:file:/usr/local/projects/JOGL/gluegen/build-x86_64 öä lala/gluegen-rt.jar!/", true);
    testURI2URL("file:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar", "file:/usr/local/projects/JOGL/gluegen/build-x86_64 öä lala/gluegen-rt.jar", true);
    testURI2URL("jar:http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", "jar:http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", false);
    testURI2URL("jar:http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/", "jar:http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/", false);
    testURI2URL("http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar", "http:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar", false);
    testURI2URL("jar:ftp:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", "jar:ftp:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar!/com/jogamp/common/os/Platform.class", false);
    testURI2URL("ftp:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar", "ftp:/usr/local/projects/JOGL/gluegen/build-x86_64%20%c3%b6%c3%a4%20lala/gluegen-rt.jar", false);
}