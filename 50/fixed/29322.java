@java.lang.Override
public mt.edu.um.b_d_app.AtomicTransaction next() {
    if ((this.index) < (this.transactions.size())) {
        return this.transactions.get(((index)++));
    }
    (index)++;
    return null;
}