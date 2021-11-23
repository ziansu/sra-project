@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    co.gov.inci.evaluon.backend.services.gui.ToastService.error(this, error);
    finish();
}