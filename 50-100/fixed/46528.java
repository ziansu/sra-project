@java.lang.Override
public xxl.core.util.Interval<T> read(java.io.DataInput dataInput, xxl.core.util.Interval<T> object) throws java.io.IOException {
    if (object == null)
        object = new xxl.core.util.Interval<T>();
    
    object.lo = kConv.read(dataInput, object.lo);
    object.loIn = dataInput.readBoolean();
    object.hi = kConv.read(dataInput, object.hi);
    object.hiIn = dataInput.readBoolean();
    return object;
}