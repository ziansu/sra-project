@java.lang.Override
public void rename(final java.lang.String newName) {
    if (!(name.equals(newName))) {
        aliasedNames.add(name);
        aliasedNames.remove(newName);
        name = newName;
    }
}