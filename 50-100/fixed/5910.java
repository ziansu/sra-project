@java.lang.Override
public boolean hasNext() {
    if (this.cur.hasNext()) {
        return true;
    }
    while (this.hasNext()) {
        this.cur = f.apply(this.next()).iterator();
        if (this.cur.hasNext()) {
            return true;
        }
    } 
    return false;
}