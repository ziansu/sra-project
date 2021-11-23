@java.lang.Override
public void onTabReSelected(@android.support.annotation.IdRes
int tabId) {
    if (tabId == (id.contacts)) {
        android.content.Intent contactsIntent = new android.content.Intent(getApplicationContext(), com.example.user.kchat01.GroupsActivity.class);
        startActivity(contactsIntent);
    }
}