@java.lang.Override
protected org.eclipse.ltk.core.refactoring.Change createChange() throws org.eclipse.core.runtime.CoreException {
    return new org.eclipse.ltk.core.refactoring.CompositeChange(changeName, new org.eclipse.ltk.core.refactoring.Change[]{ importChange , change });
}