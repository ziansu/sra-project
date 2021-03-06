public void setText(java.lang.CharSequence text) {
    if (text == null)
        throw new java.lang.IllegalArgumentException("text cannot be null.");
    
    if (text.equals(this.text))
        return ;
    
    this.text = text;
    computeBounds();
    invalidateHierarchy();
}