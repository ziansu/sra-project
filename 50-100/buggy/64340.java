protected java.lang.String getContactsString() {
    java.lang.String s = "";
    java.util.Iterator<fry.oldschool.utils.Contact> it = contacts.iterator();
    if (it.hasNext()) {
        s += it.next().id;
    }
    while (it.hasNext()) {
        s += (SEP_1) + (it.next().id);
    } 
    if (s.isEmpty()) {
        return "n";
    }
    return s;
}