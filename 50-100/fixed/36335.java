public void Pow(int order) {
    u0251055.myComplex c = new u0251055.myComplex(real, imaginary);
    if (order < 0) {
        for (int i = 0; i >= order; i--)
            this.Div(c);
        
    }else {
        for (int i = 2; i <= order; i++)
            this.Mul(c);
        
    }
}