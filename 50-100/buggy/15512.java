public java.lang.String getLineCode(int i) {
    if (!(this.isStart))
        return null;
    
    java.lang.String[] srcArray = this.src.split("\n");
    if (((srcArray.length) >= i) || (i < 0))
        return null;
    
    return srcArray[i];
}