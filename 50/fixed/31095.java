public void addBuffer(org.eclipse.jdt.core.IBuffer buffer) {
    if ((buffer == null) || ((buffer.getContents()) == null))
        return ;
    
    super.addBuffer(buffer);
}