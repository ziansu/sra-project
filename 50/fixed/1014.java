@java.lang.Override
public void onClick(android.view.View view) {
    new ir.rasen.charsoo.model.business.DeleteBusiness(context, ir.rasen.charsoo.controller.helper.LoginInfo.getUserId(context), businessId).execute();
    dismiss();
}