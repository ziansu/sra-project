public java.lang.String getDescription() {
    java.lang.String description = specHandler.getDescription();
    return description.equals("No description provided") ? "" : description;
}