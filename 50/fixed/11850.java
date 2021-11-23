@java.lang.Override
public void rename(final java.lang.String newName) {
    if ((null != newName) && (!(name.equals(newName)))) {
        aliasedNames.add(name);
        aliasedNames.remove(newName);
        name = newName;
    }
}