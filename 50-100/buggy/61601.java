@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new radio button", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "thickness" })
public org.protocoderrunner.apprunner.api.widgets.PRadioButton newRadioButton(java.lang.String label, boolean initstate, final org.protocoderrunner.apprunner.api.widgets.PUIGeneric.addGenericRadioButtonCB callbackfn) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PRadioButton rb = new org.protocoderrunner.apprunner.api.widgets.PRadioButton(getContext());
    rb.setChecked(initstate);
    rb.setText(label);
    rb.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {
        @java.lang.Override
        public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
            callbackfn.event(isChecked);
        }
    });
    themeWidget(rb);
    return rb;
}