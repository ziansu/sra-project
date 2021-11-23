@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new input", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "label, function(data)" })
public org.protocoderrunner.apprunner.api.widgets.PEditText newInput(java.lang.String label) {
    initializeLayout();
    final org.protocoderrunner.apprunner.api.widgets.PEditText et = new org.protocoderrunner.apprunner.api.widgets.PEditText(getContext());
    et.setHint(label);
    themeWidget(et);
    return et;
}