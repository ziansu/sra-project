public boolean VerifyChecksum() {
    if (isVerify)
        return true;
    
    int temp = 0;
    for (int i = 0; i < (this.position); i++)
        temp += this.FrameData[i];
    
    if (((temp + (this.CheckSum)) & 255) == 255)
        isVerify = true;
    else
        isVerify = false;
    
    return isVerify;
}