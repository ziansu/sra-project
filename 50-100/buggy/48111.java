@java.lang.SuppressWarnings(value = "unchecked")
public <T> java.lang.String getError(java.lang.Class<? extends ru.alexbykov.novalid.custom.AbstractFieldSettings> clazz) {
    ru.alexbykov.novalid.custom.AbstractFieldSettings fieldSettings = store.get(clazz);
    if ((fieldSettings.getField()) == null) {
        throw new ru.alexbykov.novalid.NoFieldException();
    }
    fieldSettings.setContext(context);
    return fieldSettings.getError();
}