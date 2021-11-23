@java.lang.Override
public void onClick(android.view.View v) {
    datePickerDialog.show(getActivity().getSupportFragmentManager(), com.fly.firefly.ui.activity.BookingFlight.SearchFlightFragment.DATEPICKER_TAG);
    PICKER = RETURN_DATE_PICKER;
    com.fly.firefly.AnalyticsApplication.sendEvent("Click", "returnDateblock");
}