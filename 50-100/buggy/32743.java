@java.lang.Override
public boolean isOne() {
    if (!(this.factors[0].isOne()))
        return false;
    
    for (int i = 1; i < (this.factors.length); i++) {
        if (!(this.factors[i].isZero()))
            return false;
        
    }
    return false;
}