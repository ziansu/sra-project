public void setRegisterW(int registerW) {
    if (registerW < 0) {
        registerW = 256 - (registerW * (-1));
    }else
        if (registerW > 255) {
            registerW = 256 - registerW;
        }
    
    this.registerW = registerW;
}