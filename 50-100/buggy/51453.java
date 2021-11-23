@java.lang.Override
public boolean hasNext() {
    if (!(jp.root42.indolently.Indolently.isNull(this.cur))) {
        return true;
    }else
        if (!(this.hasNext())) {
            return false;
        }
    
    final T val = this.next();
    if (f.test(val)) {
        this.cur = java.util.Optional.ofNullable(val);
        return true;
    }
    return this.hasNext();
}