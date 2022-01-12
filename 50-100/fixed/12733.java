private static long getSerialVersionUID(org.babyfish.persistence.tool.path.TypedQueryPathProcessor.MetaClass metaClass, java.lang.String nestedSimpleClassName) throws java.io.IOException {
    long serialVersionUID = (nestedSimpleClassName != null) ? nestedSimpleClassName.hashCode() : 0;
    for (org.babyfish.persistence.tool.path.TypedQueryPathProcessor.MetaProperty property : metaClass.getProperties().values()) {
        serialVersionUID += (serialVersionUID * 31) + (property.getName().hashCode());
    }
    return serialVersionUID;
}