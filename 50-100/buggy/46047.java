public static org.eclipse.uml2.uml.Class referenceMetaclass(org.eclipse.uml2.uml.Profile profile, java.lang.String name) {
    org.eclipse.uml2.uml.Model umlMetamodel = ((org.eclipse.uml2.uml.Model) (org.batchjob.uml.io.utils.Uml2Utils.load(org.eclipse.emf.common.util.URI.createURI(UMLResource.UML_METAMODEL_URI))));
    org.eclipse.uml2.uml.Class metaclass = ((org.eclipse.uml2.uml.Class) (umlMetamodel.getOwnedType(name)));
    profile.createMetaclassReference(metaclass);
    return metaclass;
}