private void installThreadMethods(org.teavm.html4j.ClassHolder cls) {
    cls.addMethod(createMethodThrowingSecurityException(new org.teavm.html4j.MethodDescriptor("setName", java.lang.String.class, void.class), false));
    cls.addMethod(createMethodThrowingSecurityException(new org.teavm.html4j.MethodDescriptor("setDaemon", boolean.class, void.class), false));
}