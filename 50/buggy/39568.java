public java.lang.String getSourceName(java.lang.String Default) {
    if ((this.source) == null)
        return Default;
    
    return this.source.info.getName();
}