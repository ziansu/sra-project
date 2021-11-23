@butterknife.OnClick(value = R.id.btnUseLastPhonecall)
public void btnUseLastPhonecallClicked() {
    _tracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("Action").setAction("Use_Last_Phone_Number").build());
    com.greenpixels.seanecio.telephony.PhoneNumberLocalPersistence persistence = new com.greenpixels.seanecio.telephony.PhoneNumberLocalPersistence();
    this._editTextPhoneNumber.setText(persistence.getLastPhoneNumber(this));
}