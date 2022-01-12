public void draw() {
    background(240);
    dropdownMObjectAlphaFloat = DropdownDrawFloat(dropdownMObjectAlphaFloat, ((width) - (offsetInt)), offsetInt, buttonOpenCloseMuseumObject, "Exhibition");
    dropdownPlayerAlphaFloat = DropdownDrawFloat(dropdownPlayerAlphaFloat, offsetInt, offsetInt, buttonOpenClosePlayerObject, "Visitor");
}