public java.util.List<graphene.model.idl.G_Property> getProperties() {
    java.util.List<graphene.model.idl.G_Property> tags = java.util.Collections.EMPTY_LIST;
    tags.add(new graphene.model.idlhelper.PropertyHelper(graphene.model.idl.G_PropertyTag.TYPE, getNodetype()));
    return tags;
}