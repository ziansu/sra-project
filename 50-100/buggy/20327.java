@java.lang.Override
public java.lang.String toString() {
    if ((this.conceptSequence) <= 0) {
        java.util.Optional<java.lang.String> description = getPreferedConceptDescriptionText();
        if (description.isPresent()) {
            return description.get();
        }
    }
    return "No description for: " + (conceptSequence);
}