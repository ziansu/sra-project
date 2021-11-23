@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new slider", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "max" , "progress" , "function(progress)" })
public org.protocoderrunner.apprunner.api.widgets.PSlider newSlider(float min, float max) {
    initializeLayout();
    final org.protocoderrunner.apprunner.api.widgets.PSlider sb = new org.protocoderrunner.apprunner.api.widgets.PSlider(getContext());
    sb.setMin(min);
    sb.setMax(max);
    return sb;
}