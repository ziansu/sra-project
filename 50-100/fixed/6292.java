private org.jasig.portal.groups.pags.IPersonTester initializeTester(org.jasig.portal.groups.pags.dao.IPersonAttributesGroupTestDefinition test) {
    try {
        java.lang.Class<?> testerClass = java.lang.Class.forName(test.getTesterClassName());
        java.lang.reflect.Constructor<?> c = testerClass.getConstructor(org.jasig.portal.groups.pags.dao.IPersonAttributesGroupTestDefinition.class);
        java.lang.Object o = c.newInstance(test);
        return ((org.jasig.portal.groups.pags.IPersonTester) (o));
    } catch (java.lang.Exception e) {
        logger.error("Error in initializing tester class: {}", test.getTesterClassName(), e);
        return null;
    }
}