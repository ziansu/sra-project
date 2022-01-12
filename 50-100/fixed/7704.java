public java.lang.String toString(android.content.Context context) {
    java.lang.String[] values = context.getResources().getStringArray(R.array.element_types_array);
    if ((value) == (com.freak.carnetdentretien.domain.bean.MaintenanceElement.Type.OTHER.value)) {
        return values[((values.length) - 1)];
    }else {
        return values[((value) - 1)];
    }
}