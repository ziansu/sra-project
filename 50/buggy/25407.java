public static control.ControlSystemService getInstance(sensor.SensorServices sL) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    if ((control.ControlSystemService.controlSystemService) == null)
        control.ControlSystemService.controlSystemService = new control.ControlSystemService(sL);
    
    return control.ControlSystemService.controlSystemService;
}