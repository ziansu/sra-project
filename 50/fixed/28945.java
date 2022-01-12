private void addTopoLinkToRobot(java.lang.String name, org.xtext.urdf.myURDF.Robot robo) {
    org.xtext.urdf.myURDF.Link newLink = MyURDFFactory.eINSTANCE.createLink();
    newLink.setName(name);
    robo.getLinks().add(newLink);
}