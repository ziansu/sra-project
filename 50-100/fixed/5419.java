public void deleteUser(final java.lang.String name) throws javax.jcr.RepositoryException {
    org.jahia.training.JCRTemplate.getInstance().doExecuteWithSystemSession(new org.jahia.training.JCRCallback() {
        @java.lang.Override
        public java.lang.Boolean doInJCR(final org.jahia.training.JCRSessionWrapper session) throws javax.jcr.RepositoryException {
            org.jahia.services.content.decorator.JCRUserNode user = getUserByName(name, session);
            jahiaUserManagerService.deleteUser(user.getPath(), session);
            session.save();
            return true;
        }
    });
}