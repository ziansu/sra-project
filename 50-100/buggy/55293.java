public void testInheritedConstraints() throws java.lang.Exception {
    java.lang.String classSource = "package org.groovy.grails.validation\n" + ((((((("class Test {\n" + "   Long id\n") + "   Long version\n") + "   String name\n") + "   static constraints = {\n") + "      name(nullable: false, validator : { \'called\' })\n") + "   }") + "}");
    java.lang.String descendentSource = "package org.grails.validation\n" + (((("class TestB extends Test {\n" + "   static constraints = {\n") + "      name(size:5..20)\n") + "   }") + "}");
    ensureConstraintsPresent(new java.lang.String[]{ classSource , descendentSource }, 1, 3);
}