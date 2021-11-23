@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new touch area", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "boolean" , "function(touching, x, y)" })
public org.protocoderrunner.views.TouchAreaView newTouchArea(boolean showArea, final org.protocoderrunner.apprunner.api.widgets.PUIGeneric.addGenericTouchAreaCB callbackfn) {
    initializeLayout();
    org.protocoderrunner.views.TouchAreaView taV = new org.protocoderrunner.views.TouchAreaView(getContext(), showArea);
    taV.setTouchAreaListener(new org.protocoderrunner.views.TouchAreaView.OnTouchAreaListener() {
        @java.lang.Override
        public void onTouch(org.protocoderrunner.views.TouchAreaView touchAreaView, boolean touching, float x, float y) {
            callbackfn.event(touching, x, y);
        }
    });
    return taV;
}