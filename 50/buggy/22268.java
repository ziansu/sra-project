@java.lang.Override
public void var(funny.Symbol symbol, java.lang.Object value) {
    if ((this.parent) == null)
        throw new java.lang.NullPointerException("????");
    
    this.parent.var(symbol, value);
}