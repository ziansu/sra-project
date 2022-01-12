public void UpdateView() {
    speed.setText(java.lang.String.format("%.3f km/h", tourManager.GetAvgSpeed_kmh()));
    java.text.DateFormat df = new java.text.SimpleDateFormat("hh:mm:ss");
    java.lang.String formatted = df.format(new java.util.Date(tourManager.GetDuration_ms()));
    dauer.setText(java.lang.String.format("%s h", formatted));
    strecke.setText(java.lang.String.format("%.3f km", tourManager.GetDistance_km()));
}