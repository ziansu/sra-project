public ui.components.pickers.LabelPickerState nextSuggestion() {
    if (canIncreaseIndex()) {
        return new ui.components.pickers.LabelPickerState(initialLabels, addedLabels, removedLabels, matchedLabels, java.util.OptionalInt.of(((currentSuggestionIndex.getAsInt()) + 1)));
    }
    return this;
}