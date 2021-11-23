@java.lang.Override
public com.google.devtools.build.android.StartTag setTo(java.lang.String value) {
    if (!((optional) && (com.google.common.base.Strings.isNullOrEmpty(value)))) {
        owner.attributes.add(((((" " + (name)) + "=\"") + value) + "\""));
    }
    return owner;
}