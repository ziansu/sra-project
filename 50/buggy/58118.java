@java.lang.Override
public <Result extends java.lang.Object> Result execute(final org.eclipse.xtext.util.concurrent.IUnitOfWork<Result, ? super org.eclipse.xtext.java.resource.JavaResource> unit) throws java.lang.Exception {
    this.getLock();
    synchronized(this.getLock()) {
        return unit.exec(this);
    }
}