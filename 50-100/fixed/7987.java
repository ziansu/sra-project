@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    java.lang.System.out.println(("key of order firebase ----> " + key));
    java.lang.String key1 = dataSnapshot.getRef().getKey();
    java.lang.System.out.println(("key of order changed in database " + key1));
    if (key.equals(key1)) {
        progressWheel.setVisibility(View.INVISIBLE);
        textView.setText("Your order is ready !!! ");
    }
}