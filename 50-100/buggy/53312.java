@java.lang.Override
public void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    com.facebook.react.bridge.ReactContext reactContext = ((com.facebook.react.bridge.ReactContext) (view.getContext()));
    @android.annotation.SuppressLint(value = "DefaultLocale")
    java.lang.String date = java.lang.String.format("%d-%d-%d", year, (monthOfYear + 1), dayOfMonth);
    reactContext.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).getEventDispatcher().dispatchEvent(new com.bitup.datepickercomponent.RNDatePickerComponentEvent(view.getId(), 0, date));
}