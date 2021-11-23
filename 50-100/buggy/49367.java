@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this))
        return true;
    
    if (obj instanceof org.eclipse.cdt.internal.core.pdom.dom.PDOMFile) {
        org.eclipse.cdt.internal.core.pdom.dom.PDOMFile other = ((org.eclipse.cdt.internal.core.pdom.dom.PDOMFile) (obj));
        return (fLinkage.getPDOM().equals(other.getLinkage().getPDOM())) && ((record) == (other.record));
    }
    return false;
}