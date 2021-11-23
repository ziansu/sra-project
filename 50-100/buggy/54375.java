public void handleMenuButtonClick(javafx.event.ActionEvent e) throws java.io.IOException {
    java.lang.String[] seg = e.getSource().toString().split(java.util.regex.Pattern.quote("'"));
    java.lang.System.out.println(seg[((seg.length) - 1)]);
    WeatherAPI.WeatherForecast weatherfore = new WeatherAPI.WeatherForecast(seg[((seg.length) - 1)]);
}