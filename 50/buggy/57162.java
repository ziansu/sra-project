@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new toggle", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "name" , "boolean" , "function(b)" })
public org.protocoderrunner.apprunner.api.widgets.PToggleButton newToggle(final java.lang.String label, boolean initstate) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PToggleButton tb = new org.protocoderrunner.apprunner.api.widgets.PToggleButton(getContext());
    tb.setChecked(initstate);
    tb.setText(label);
    return tb;
}