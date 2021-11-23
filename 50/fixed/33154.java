@java.lang.Override
public boolean inputFilter(java.lang.Object object, java.lang.Object sourceID) {
    return !((object instanceof org.eventb.emf.core.EventBElement) && (sourceID.equals(((org.eventb.emf.core.EventBElement) (object)).getAttributes().get(AttributeIdentifiers.GENERATOR_ID_KEY))));
}