public void onClick(android.view.View view) {
    if ((customFatIsFilledIn) && (customProteinIsFilledIn)) {
        getMacros();
        goToFinalCaloriesAndMacrosActivity();
    }
}