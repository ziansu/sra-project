@java.lang.Override
public int compare(com.addressbook.thorrism.addressbook.Contact lhs, com.addressbook.thorrism.addressbook.Contact rhs) {
    int val = lhs.getLastName().compareTo(rhs.getLastName());
    android.util.Log.e("TEST", "SORT BY LAST NAME");
    if (val == 0)
        return ((lhs.getFirstName()) + (lhs.getLastName())).compareTo(((rhs.getFirstName()) + (rhs.getLastName())));
    else
        return val;
    
}