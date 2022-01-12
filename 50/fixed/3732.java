@java.lang.Override
public void run() {
    ir.rasen.charsoo.view.dialog.DialogDeleteBusinessConfirmation d = new ir.rasen.charsoo.view.dialog.DialogDeleteBusinessConfirmation(context, businessId);
    d.show();
    this.dismiss();
}