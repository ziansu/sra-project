@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return chatFragment;
        case 2 :
            return publicGroupFragment;
        case 1 :
            if ((contactsFragment) != null) {
                return contactsFragment;
            }
            return contactsFragment = new com.superchat.ui.ContactsScreen();
        case 3 :
            return bulletinFragment;
        default :
            return new com.superchat.ui.TempFragment();
    }
}