@java.lang.Override
public void onClick(android.view.View view) {
    searchedLocationEditTextField.setText("My Location");
    shouldGetLocationFromLocationEditText = false;
    shouldGetLocationFromUserData = true;
}