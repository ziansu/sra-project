@java.lang.Override
public java.lang.Object getItem(int position) {
    if ((contactList.size()) == 0)
        return null;
    
    return contactList.get(position);
}