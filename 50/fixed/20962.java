@java.lang.Override
public void addAliasedName(final java.lang.String origName) {
    if ((null != origName) && (!(name.equals(origName)))) {
        aliasedNames.add(origName);
    }
}