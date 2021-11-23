@java.lang.Override
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
public java.lang.String getUrlName() {
    return getDisplayName().toLowerCase().replace(" ", "-");
}