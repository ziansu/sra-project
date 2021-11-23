@java.lang.Override
public void addAliasedName(final java.lang.String origName) {
    if (!(name.equals(origName))) {
        aliasedNames.add(origName);
    }
}