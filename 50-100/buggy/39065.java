private boolean isValid(java.lang.String name, java.lang.String description, android.widget.RadioGroup radioGroup) {
    boolean isValid = true;
    if (!(isValidName(name))) {
        nameInputEditText.setError("A name is required and must be at least 3 characters long.");
        isValid = false;
    }
    if (!(isValidDescription(description))) {
        descriptionInputEditText.setError("A description cannot be more than 240 characters.");
        isValid = false;
    }
    if (!(isValidRadio(radioGroup))) {
        distanceRadio.setError("A tracking option must be selected.");
        isValid = false;
    }
    return isValid;
}