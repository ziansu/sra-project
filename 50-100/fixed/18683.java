public void loadLP(java.lang.String filepath) throws streetnetwork.controller.LoadLPException {
    try {
        streetnetwork.controller.StreetNetworkController.vintersections = streetnetwork.controller.Serializer.getInstance().readFromFile(filepath);
        streetnetwork.controller.StreetNetworkController.rows = streetnetwork.controller.StreetNetworkController.vintersections.length;
        streetnetwork.controller.StreetNetworkController.columns = streetnetwork.controller.StreetNetworkController.vintersections[0].length;
    } catch (javax.xml.bind.JAXBException ex) {
        java.util.logging.Logger.getLogger(streetnetwork.controller.StreetNetworkController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        throw new streetnetwork.controller.LoadLPException(ex);
    }
}