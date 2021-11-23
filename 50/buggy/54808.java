@java.lang.Override
public java.lang.Boolean apply(A argument) {
    if (!(this.apply(argument))) {
        return java.lang.Boolean.FALSE;
    }else {
        return predicate.apply(argument);
    }
}