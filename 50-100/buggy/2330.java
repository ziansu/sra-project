@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }else
        if (requestCode == (org.wit.myrent.activities.ResidenceFragment.REQUEST_CONTACT)) {
            java.lang.String name = org.wit.android.helpers.ContactHelper.getContact(this, data);
            emailAddress = org.wit.android.helpers.ContactHelper.getEmail(this, data);
            tenantButton.setText(((name + " : ") + (emailAddress)));
            residence.tenant = name;
        }
    
}