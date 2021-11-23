@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((isNull) || (((model.data.value.DataValue) (obj)).isNull())) {
        return false;
    }
    if ((this.getClass()) != (obj.getClass())) {
        return false;
    }
    return doEquals(obj);
}