@org.junit.Test
public void instantiateJavaApiClassWhichHasBootstrapClassLoader() {
    nl.jqno.equalsverifier.internal.Instantiator<java.util.List> instantiator = nl.jqno.equalsverifier.internal.Instantiator.of(java.util.List.class);
    instantiator.instantiateAnonymousSubclass();
}