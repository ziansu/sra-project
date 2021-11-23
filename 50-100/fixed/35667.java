public boolean enterCode(float real, float imag) {
    realCode[nCode] = real;
    imagCode[nCode] = imag;
    (nCode)++;
    if ((nCode) < ((N) - 1))
        return false;
    else
        return true;
    
}