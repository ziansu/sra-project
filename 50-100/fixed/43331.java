@java.lang.Override
public void onBackPressed() {
    if (viewFlipped)
        new android.app.AlertDialog.Builder(this).setTitle("Quit game").setMessage("Do you really want to leave the game? Progress will be lost and the connection will be closed.").setPositiveButton("Yes", new android.content.DialogInterface.OnClickListener() {
            @java.lang.Override
            public void onClick(android.content.DialogInterface dialog, int which) {
                de.thm.nfcmemory.GameActivity.super.onBackPressed();
            }
        }).setNegativeButton("No", null).setNeutralButton("Cancel", null).show();
    else
        super.onBackPressed();
    
}