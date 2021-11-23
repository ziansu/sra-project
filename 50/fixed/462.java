@org.openflexo.connie.annotations.NotificationUnsafe
public java.util.List<org.openflexo.foundation.ontology.FlexoOntologyObjectImpl<TA>> getChildren(org.openflexo.foundation.ontology.IFlexoOntologyObject<TA> father) {
    if (father == null) {
        return null;
    }
    if ((structure) != null) {
        return structure.get(father);
    }
    return null;
}