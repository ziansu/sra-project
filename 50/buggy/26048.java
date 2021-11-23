@java.lang.Override
public void setDefaultValue(java.lang.String value) {
    checkValidDefaultValue(validValues, value);
    this.defaultValue = value;
}