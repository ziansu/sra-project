@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt("mode", mode);
    outState.putLong("selected_country", selectedCountry.getId());
}