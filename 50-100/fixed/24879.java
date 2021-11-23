protected void setText(java.lang.String text, boolean geocodeIfDifferent) {
    if (!(java.util.Objects.equals(getText(), text))) {
        this.getState().text = text;
        if (geocodeIfDifferent && ((text.length()) > (this.getMinimumQueryCharacters()))) {
            clearChoices();
            this.geocoderController.geocode(this, text);
        }
        org.vaadin.addons.locationtextfield.LocationTextField.markAsDirty();
    }
}