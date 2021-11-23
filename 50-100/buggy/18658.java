@java.lang.Override
public java.lang.Object clone() {
    lib.jadsl.collections.data.vector.DataVector<T> res = null;
    try {
        res = this.getClass().getConstructor(java.lang.Integer.class, data.getClass(), lib.jadsl.collections.data.vector.DataVectorType.class).newInstance(data.length, data, type);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return res;
}