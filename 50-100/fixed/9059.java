@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    ca.ualberta.cs.zindi.zindi_sizebook.Person mPerson = newPeopleList.get(position);
    android.content.Intent mIntent = new android.content.Intent(this, ca.ualberta.cs.zindi.zindi_sizebook.PersonActivity.class);
    android.os.Bundle mBundle = new android.os.Bundle();
    mBundle.putParcelable(ca.ualberta.cs.zindi.zindi_sizebook.MainActivity.PAR_KEY, mPerson);
    mIntent.putExtras(mBundle);
    startActivityForResult(mIntent, ca.ualberta.cs.zindi.zindi_sizebook.MainActivity.EDIT_REQUEST);
}