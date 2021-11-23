@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which == 0) {
        android.content.Intent i = new android.content.Intent(this, org.anhtn.securesms.app.ListContactActivity.class);
        i.putExtra("content", mAdapter.getItem(mCurrentPosLongClick).Content);
        i.putExtra("address", list.get(which).Address);
        startActivity(i);
    }else {
        showChooseContactDialog();
    }
}