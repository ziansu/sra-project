@java.lang.Override
public boolean equals(java.lang.Object fv) {
    if (fv instanceof com.example.willpassidomo.androidcomponents.FieldValue) {
        com.example.willpassidomo.androidcomponents.FieldValue fvv = ((com.example.willpassidomo.androidcomponents.FieldValue) (fv));
        return (this.field.equals(fvv.getField())) && (value.equals(fvv.getValue()));
    }
    return false;
}