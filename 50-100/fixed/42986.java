public void set(@android.support.annotation.Nullable
FieldType value) {
    if ((value == null) && ((field) == null)) {
        return ;
    }
    if ((value == null) || (!(value.equals(field)))) {
        this.field = value;
        if ((listener) != null) {
            listener.onFieldValueChanged(value);
        }
    }
}