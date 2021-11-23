private void addTopoLinkToRobot(org.xtext.urdf.myURDF.Topology topo, org.xtext.urdf.myURDF.Robot robo) {
    org.xtext.urdf.myURDF.Link newLink = MyURDFFactory.eINSTANCE.createLink();
    newLink.setName(getNodeText(topo, 1));
    robo.getLinks().add(newLink);
}