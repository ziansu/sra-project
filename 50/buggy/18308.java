@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new text", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "text" })
public org.protocoderrunner.apprunner.api.widgets.PTextView newText(java.lang.String label) {
    org.protocoderrunner.apprunner.api.widgets.PTextView tv = new org.protocoderrunner.apprunner.api.widgets.PTextView(getContext());
    initializeLayout();
    tv.setText(label);
    themeWidget(tv);
    return tv;
}