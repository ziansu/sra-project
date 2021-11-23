@java.lang.Override
public java.lang.String getUrlName() {
    return getDisplayName().toLowerCase().replaceAll(" ", "-");
}