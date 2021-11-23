@org.junit.Test
public void addToResourceTest() {
    org.eclipse.epsilon.cbp.event.EventAdapter adapter = new org.eclipse.epsilon.cbp.event.EventAdapter(new org.eclipse.epsilon.cbp.util.Changelog());
    org.eclipse.emf.ecore.resource.Resource resource = new org.eclipse.emf.ecore.resource.impl.ResourceImpl();
    resource.eAdapters().add(adapter);
    university.UniversityFactory factory = university.UniversityFactory.eINSTANCE;
    university.University university = factory.createUniversity();
    resource.getContents().add(university);
    org.eclipse.epsilon.cbp.util.Changelog changelog = adapter.getChangelog();
    org.junit.Assert.assertEquals(changelog.getEventsList().get(1).getEventType(), Event.ADD_EOBJ_TO_RESOURCE);
}