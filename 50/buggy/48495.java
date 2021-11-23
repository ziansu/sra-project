@java.lang.Override
public java.lang.Object[] toArray() {
    java.lang.Object[] array = new java.lang.Object[this.size()];
    java.lang.System.arraycopy(this.array, 0, array, 0, array.length);
    return array;
}