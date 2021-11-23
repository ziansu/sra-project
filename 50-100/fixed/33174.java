public void UpdateView() {
    speed.setText(java.lang.String.format("%.3f km/h", tourManager.GetAvgSpeed_kmh()));
    dauer.setText(java.lang.String.format("%s h", tourManager.GetDuration_ms()));
    strecke.setText(java.lang.String.format("%.3f km", tourManager.GetDistance_km()));
}