public void setName(java.lang.String newName) {
    if (!(newName.equals(name))) {
        name = newName;
        commitChanges();
    }
}