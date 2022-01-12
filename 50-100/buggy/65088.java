@java.lang.Override
public boolean equals(java.lang.Object fv) {
    if (fv instanceof com.example.willpassidomo.androidcomponents.FieldValue) {
        return false;
    }else {
        com.example.willpassidomo.androidcomponents.FieldValue fvv = ((com.example.willpassidomo.androidcomponents.FieldValue) (fv));
        return (this.field.equals(fvv.getField())) && (value.equals(fvv.getValue()));
    }
}