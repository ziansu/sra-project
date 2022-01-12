@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case com.whatsoft.contactbook.activity.MainActivity.REQUEST_ADD_CONTACT :
            if ((listType) == (com.whatsoft.contactbook.constant.ListType.ALL)) {
                com.whatsoft.contactbook.model.Contact contact = ((com.whatsoft.contactbook.model.Contact) (data.getSerializableExtra(ProfileActivity.EXTRA_CONTACT)));
                if (contact != null) {
                    contacts.add(0, contact);
                    contactListAdapter.notifyDataSetChanged();
                }
            }
            break;
    }
}