@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    menuToggleOpen = false;
    setUpMenu();
    activeCity = "London";
    updateValues();
    menuToggleOpen = false;
    circle.setRotate(((-15) * (java.lang.Double.parseDouble(currentHour))));
    rotate = (-15) * (java.lang.Double.parseDouble(currentHour));
    button.setFocusTraversable(false);
    dragMenu.setFocusTraversable(false);
    WeatherApp.Main.theStage.setResizable(false);
}