@java.lang.Override
public boolean acceptableParameterName(final java.lang.String paramName) {
    return !(this.relations.containsKey(paramName));
}