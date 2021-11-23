@java.lang.Override
public java.nio.file.Path getPwd() {
    try {
        autoLoad();
    } catch (java.io.IOException | org.xml.sax.SAXException | javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
    }
    return super.getPwd();
}