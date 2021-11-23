@java.lang.Override
public java.util.Iterator<java.nio.file.Path> iterator() {
    java.lang.System.err.println("iter");
    try {
        autoLoad();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    } catch (javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
    }
    return super.iterator();
}