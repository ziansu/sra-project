private static void initXml() throws javax.xml.parsers.ParserConfigurationException, javax.xml.transform.TransformerException {
    try {
        controller.Controller.createDocument();
        controller.Controller.readXml();
    } catch (javax.xml.parsers.ParserConfigurationException e) {
    } catch (java.io.IOException e) {
        java.lang.System.err.println("You library is empty");
        controller.Controller.createXmlFile();
        view.ConsoleInterface.mainScreen();
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    }
}