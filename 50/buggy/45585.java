@java.lang.Override
public void put(java.lang.String name, java.lang.Object value) {
    chap6.Environment e = where(name);
    if (e == null) {
        e = this;
    }
    ((chap7.FuncEvaluator.EnvEx) (e)).putNew(name, values);
}