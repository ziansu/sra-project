@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new number picker", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "from" , "to" , "function(data)" })
public org.protocoderrunner.apprunner.api.widgets.PNumberPicker newNumberPicker(int from, int to, final org.protocoderrunner.apprunner.api.widgets.PUIGeneric.NewGenericNumberPickerCB callback) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PNumberPicker pNumberPicker = new org.protocoderrunner.apprunner.api.widgets.PNumberPicker(getContext());
    pNumberPicker.setMinValue(from);
    pNumberPicker.setMaxValue(to);
    pNumberPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() {
        @java.lang.Override
        public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
            callback.event(newVal);
        }
    });
    return pNumberPicker;
}