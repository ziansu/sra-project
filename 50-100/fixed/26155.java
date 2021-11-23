public  resolveEquacao() {
    this.x1 = 0;
    this.term1 = (this.b) / 3.0;
    if ((this.discrim) > 0) {
        discrimPos();
    }else
        if ((this.discrim) == 0) {
            discrimZer();
        }else {
            discrimNeg();
        }
    
}