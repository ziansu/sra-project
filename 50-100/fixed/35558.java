public void setValue(org.jahia.services.content.Node value) throws javax.jcr.lock.LockException, javax.jcr.nodetype.ConstraintViolationException, javax.jcr.version.VersionException, org.jahia.services.content.RepositoryException, org.jahia.services.content.ValueFormatException {
    if (value != null) {
        setValue(getSession().getValueFactory().createValue((value instanceof org.jahia.services.content.JCRNodeWrapper ? ((org.jahia.services.content.JCRNodeWrapper) (value)).getRealNode() : value), ((def.getRequiredType()) == (PropertyType.WEAKREFERENCE))));
    }else {
        remove();
    }
}