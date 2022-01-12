@java.lang.Override
public void onClick(android.view.View v) {
    cleanSlate();
    if (i == 0)
        a1.cak.moore.cak_finale.Create.super.onBackPressed();
    
    if (i == 2) {
        cleanSlate();
        android.widget.Toast.makeText(context, R.string.newFile, Toast.LENGTH_SHORT).show();
    }
    dialog.dismiss();
}