public void CalculateChecksum() {
    if (this.isVerify)
        return ;
    
    int CS = 0;
    for (int i = 0; i < (this.position); i++)
        CS += this.FrameData[i];
    
    this.CheckSum = (255 - CS) & 255;
    this.isVerify = true;
}