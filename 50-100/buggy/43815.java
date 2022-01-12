@java.lang.Override
public int compare(com.addressbook.thorrism.addressbook.Contact lhs, com.addressbook.thorrism.addressbook.Contact rhs) {
    int val = lhs.getZipcode().compareTo(rhs.getZipcode());
    android.util.Log.e("TEST", "SORT BY ZIPCODE");
    if (val == 0)
        return ((lhs.getFirstName()) + (lhs.getLastName())).compareTo(((rhs.getFirstName()) + (rhs.getLastName())));
    else
        return val;
    
}