@java.lang.Override
public java.util.List<graphene.model.idl.G_Property> getProperties() {
    final java.util.List<graphene.model.idl.G_Property> tags = new java.util.ArrayList<graphene.model.idl.G_Property>();
    tags.add(new graphene.model.idlhelper.PropertyHelper(graphene.model.idl.G_PropertyTag.TYPE, getNodetype()));
    return tags;
}