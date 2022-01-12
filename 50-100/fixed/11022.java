@java.lang.Override
public void setName(@solutions.digamma.damas.inspection.NotNull
java.lang.String value) throws solutions.digamma.damas.DocumentException {
    try {
        java.lang.String destination = java.net.URI.create(this.node.getPath()).resolve(value).getPath();
        this.move(destination);
    } catch (javax.jcr.RepositoryException e) {
        throw solutions.digamma.damas.jcr.error.JcrExceptionMapper.map(e);
    }
}