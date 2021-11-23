@java.lang.Override
public void onListFragmentInteraction(com.example.lipei.myapplication.dummy.DummyContent.DummyItem item, int position) {
    android.util.Log.d("IMP", "hello");
    if ((mType) == 0) {
        android.content.Intent intent = new android.content.Intent(this, com.example.lipei.myapplication.ContactActivity.class);
        intent.putExtra(ContactItemFragment.ARG_LIST_TYPE, (position + 1));
        intent.putExtra(ContactItemFragment.ARG_LIST_TYPE, (position + 1));
        startActivity(intent);
        return ;
    }
    clickAction(item);
}