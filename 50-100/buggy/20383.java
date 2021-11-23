public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String[] s = Shop.Instance.getAnimals(getApplicationContext());
    if (s[0].equals(s[1])) {
        Shop.Instance.reset();
        android.widget.Toast savedToast = android.widget.Toast.makeText(getApplicationContext(), "Cannot have duplicate animals", Toast.LENGTH_SHORT);
        savedToast.show();
    }else {
        Shop.Instance.saveAvatars(getApplicationContext());
        dialog.cancel();
    }
}