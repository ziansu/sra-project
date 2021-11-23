public int getOrigData(int index) {
    if ((index >= 0) && (index < (origPixelArray.length)))
        return origPixelArray[index];
    else
        return 0;
    
}