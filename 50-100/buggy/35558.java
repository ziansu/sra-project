public void setValue(org.jahia.services.content.Node value) throws javax.jcr.lock.LockException, javax.jcr.nodetype.ConstraintViolationException, javax.jcr.version.VersionException, org.jahia.services.content.RepositoryException, org.jahia.services.content.ValueFormatException {
    if (value != null) {
        if (value instanceof org.jahia.services.content.JCRNodeWrapper) {
            value = ((org.jahia.services.content.JCRNodeWrapper) (value)).getRealNode();
        }
        setValue(getSession().getValueFactory().createValue(value, ((def.getRequiredType()) == (PropertyType.WEAKREFERENCE))));
    }else {
        remove();
    }
}