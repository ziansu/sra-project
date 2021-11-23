public void setHeight(int height) {
    if (height == (mHeight))
        return ;
    
    if (height < 0)
        throw new java.lang.IllegalArgumentException("height cannot be less than 0");
    
    mHeight = height;
    needsLineUpdate = true;
}