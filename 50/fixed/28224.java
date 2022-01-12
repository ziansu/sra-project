public void setThrow1(int t1) {
    this._throw1 = t1;
    if ((this._throw1) == 10) {
        this._isStrike = true;
        this._value = 10;
    }else
        this._value = t1;
    
}