@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format("%s[format=%s, arguments=%s]", getClass().getSimpleName(), org.assertj.core.util.Strings.quote(format), java.lang.String.format(new org.assertj.core.presentation.StandardRepresentation(), arguments));
}