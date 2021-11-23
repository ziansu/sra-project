@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }else
        if (obj instanceof org.jahia.modules.external.vfs.VFSBinaryImpl) {
            org.jahia.modules.external.vfs.VFSBinaryImpl other = ((org.jahia.modules.external.vfs.VFSBinaryImpl) (obj));
            return (this.fileContent) == (other.fileContent);
        }else {
            return false;
        }
    
}