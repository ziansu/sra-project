public java.lang.String getTargetName(java.lang.String Default) {
    if ((this.target) == null)
        return Default;
    
    java.lang.String result = this.target.info.getName();
    if (result == null)
        return Default;
    
    return result;
}