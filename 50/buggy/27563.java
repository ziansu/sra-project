@java.lang.Override
public java.lang.String apply(java.lang.String string) {
    if (surroundWithBrackets) {
        return stringQuotation(string);
    }
    return string;
}