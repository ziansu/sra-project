@java.lang.Override
public boolean hasNext() {
    if ((!(this.cur.hasNext())) && (this.hasNext())) {
        this.cur = f.apply(this.next()).iterator();
    }
    return this.cur.hasNext();
}