@java.lang.Override
public javax.xml.namespace.QName getId() {
    java.lang.String namespace;
    if (((this.getTargetNamespace()) != null) && (!(this.getTargetNamespace().equals("")))) {
        namespace = this.getTargetNamespace();
    }else {
        namespace = this.definitions.getTargetNamespace();
    }
    javax.xml.namespace.QName id = new javax.xml.namespace.QName(((("{" + namespace) + "}") + (this.relationshipType.getName())));
    return id;
}