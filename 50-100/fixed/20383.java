public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String[] s = Shop.Instance.getAnimals(context);
    if (s[0].equals(s[1])) {
        Shop.Instance.reset();
        android.widget.Toast savedToast = android.widget.Toast.makeText(context, "Cannot have duplicate animals", Toast.LENGTH_SHORT);
        savedToast.show();
    }else {
        Shop.Instance.saveAvatars(context);
        dialog.cancel();
    }
}