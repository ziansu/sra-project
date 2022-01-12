public void reset() {
    this.ssStack.index = 0;
    this.trStack.index = 0;
    this.mergeStack.index = 0;
    for (int i = (this.bucketA.length) - 1; i >= 0; i--)
        this.bucketA[i] = 0;
    
    for (int i = (this.bucketB.length) - 1; i >= 0; i--)
        this.bucketB[i] = 0;
    
}