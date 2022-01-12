private void checkAddressBookAccess() {
    switch (org.robovm.apple.addressbook.ABAddressBook.getAuthorizationStatus()) {
        case Authorized :
            accessGrantedForAddressBook();
            break;
        case NotDetermined :
            requestAddressBookAccess();
            break;
        case Denied :
        case Restricted :
            org.robovm.apple.uikit.UIAlertView alert = new org.robovm.apple.uikit.UIAlertView("Privacy Warning", "Permission was not granted for Contacts.", null, "OK", new java.lang.String[0]);
            alert.show();
            break;
        default :
            break;
    }
}