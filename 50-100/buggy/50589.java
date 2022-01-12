public void CalculateChecksum() {
    if (this.isVerify)
        return ;
    
    int CS = 0;
    for (int i = 0; i < (this.position); i++)
        CS += this.FrameData[i];
    
    this.CheckSum = ((byte) (255 - CS));
    this.isVerify = true;
}