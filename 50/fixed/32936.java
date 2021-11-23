@org.python.Method(__doc__ = "")
public org.python.Iterable __iter__() {
    return new org.python.types.org.python.types.List(new java.util.ArrayList<org.python.types.org.python.Object>(this.value.keySet())).__iter__();
}