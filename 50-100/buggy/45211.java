@java.lang.Override
public boolean validate() {
    java.io.Serializable value = getPropertyValue();
    java.lang.String error = null;
    if (((isRequired) && ((isMultiSelect) && (selectedChoices.isEmpty()))) || (org.apache.commons.lang3.StringUtils.isBlank(value.toString()))) {
        error = "Required, cannot be blank";
    }
    setError(error);
    return error == null;
}