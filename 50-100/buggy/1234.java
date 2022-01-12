@org.junit.Test
public void shouldReadFromFieldMatchingRelationshipTypeInObjectWithoutAnnotationsOrAccessorMethods() {
    org.neo4j.ogm.metadata.info.ClassInfo classInfo = this.domainInfo.getClass(org.neo4j.ogm.unit.entityaccess.DefaultObjectAccessStrategyTest.DummyDomainObject.class.getName());
    org.neo4j.ogm.unit.entityaccess.DefaultObjectAccessStrategyTest.DummyDomainObject domainObject = new org.neo4j.ogm.unit.entityaccess.DefaultObjectAccessStrategyTest.DummyDomainObject();
    domainObject.postWithoutAccessorMethods = new org.neo4j.ogm.domain.forum.activity.Post();
    org.neo4j.ogm.unit.entityaccess.RelationalReader reader = this.objectAccessStrategy.getRelationalReader(classInfo, "POST_WITHOUT_ACCESSOR_METHODS");
    assertNotNull("The resultant object accessor shouldn't be null", reader);
    assertSame(domainObject.postWithoutAccessorMethods, reader.read(domainObject));
    assertEquals("POSTWITHOUTACCESSORMETHODS", reader.relationshipType());
}