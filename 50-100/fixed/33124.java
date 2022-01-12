protected void addNeighbours(org.jdom2.Element fingerPrint, com.example.carola.fingerprintdetection.Node nodeForNeighbours) {
    org.jdom2.Element neighbours = new org.jdom2.Element("neighbours");
    java.util.ArrayList<java.lang.String> neighboursList = ((java.util.ArrayList<java.lang.String>) (nodeForNeighbours.neighbours));
    for (int i = 0; i < (neighboursList.size()); i++) {
        org.jdom2.Element neighbourElement = new org.jdom2.Element("neighbour");
        neighbourElement.setAttribute("name", neighboursList.get(i));
        neighbours.addContent(neighbourElement);
    }
    fingerPrint.addContent(neighbours);
}