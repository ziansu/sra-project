@java.lang.Override
public void onBindViewHolder(io.centeno.weatherfinder.WeatherAdapter.WeatherViewHolder weatherViewHolder, int i) {
    io.centeno.weatherfinder.SelectedLocations info = selectedLocations.get(i);
    weatherViewHolder.location.setText(info.address);
}