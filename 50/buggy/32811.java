@java.lang.Override
public void onClick(android.view.View v) {
    org.thecosmicfrog.luasataglance.util.StopForecastUtil.showNotifyTimeDialog(rootView, spinnerCardView.getSpinnerStops().getSelectedItem().toString(), inboundStopForecastCardView.getTextViewStopTimes(), index);
}