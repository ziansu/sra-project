public void onClick(android.view.View view) {
    getMacros();
    if ((customFatIsFilledIn) && (customProteinIsFilledIn)) {
        goToFinalCaloriesAndMacrosActivity();
    }
}