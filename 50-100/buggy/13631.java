public void onClick(android.content.DialogInterface dialog, int id) {
    alertDialogBuilder.setCancelable(true);
    if ((intent.getExtras()) != null) {
        android.content.Intent intent = new android.content.Intent(this, droidahmed.com.jm3eia.start.MainActivity.class);
        intent.putExtra("CartAuth", "CartAuth");
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, droidahmed.com.jm3eia.start.MainActivity.class);
        startActivity(intent);
    }
}