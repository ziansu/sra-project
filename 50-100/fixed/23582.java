public int convertExif2Degress(int degreesConvert) {
    int returnValue;
    if (degreesConvert == 90) {
        returnValue = 90;
    }else
        if (degreesConvert == 180) {
            returnValue = 180;
        }else
            if (degreesConvert == 270) {
                returnValue = 270;
            }else {
                returnValue = 0;
            }
        
    
    return returnValue;
}