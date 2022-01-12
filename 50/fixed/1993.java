public void createContactGroup(java.lang.String name) {
    fry.oldschool.utils.ContactGroup grp = new fry.oldschool.utils.ContactGroup(name);
    App.conMan.add(grp);
    groups.add(((groups.size()) - 1), grp);
}