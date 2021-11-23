@java.lang.Override
public com.google.devtools.build.android.StartTag setTo(java.lang.String value) {
    if ((!(optional)) || (value != null)) {
        owner.attributes.add(((((" " + (name)) + "=\"") + value) + "\""));
    }
    return owner;
}