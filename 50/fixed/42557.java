@java.lang.Override
public void deleteBy(java.lang.String fields, java.lang.Object... values) throws java.lang.IllegalArgumentException {
    delete(q(fields, values));
}