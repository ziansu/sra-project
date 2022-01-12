protected java.lang.String getContactsString() {
    if ((contacts.size()) == 0) {
        return "n";
    }
    java.lang.String s = "";
    java.util.Iterator<fry.oldschool.utils.Contact> it = contacts.iterator();
    if (it.hasNext()) {
        s += it.next().id;
    }
    while (it.hasNext()) {
        s += (SEP_1) + (it.next().id);
    } 
    return s;
}