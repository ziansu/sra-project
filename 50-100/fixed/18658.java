@java.lang.Override
public java.lang.Object clone() {
    lib.jadsl.collections.data.vector.DataVector<T> res = null;
    try {
        res = this.getClass().getConstructor(java.lang.Integer.class, lib.jadsl.collections.data.vector.DataVectorType.class, data.getClass()).newInstance(data.length, type, data);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return res;
}