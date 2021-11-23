@java.lang.Override
public void onClick(android.view.View view) {
    ir.rasen.charsoo.view.dialog.DialogUnfollowBusinessConfirmation d = new ir.rasen.charsoo.view.dialog.DialogUnfollowBusinessConfirmation(context, businessId, progressDialog, iUnfollowBusiness);
    d.show();
    this.dismiss();
}