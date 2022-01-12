public void draw() {
    background(240);
    println(dropdownMObjectAlphaFloat);
    dropdownMObjectAlphaFloat = DropdownDrawFloat(dropdownMObjectAlphaFloat, ((width) - (offsetInt)), offsetInt, buttonOpenCloseMuseumObject, "Exhibition");
    dropdownPlayerAlphaFloat = DropdownDrawFloat(dropdownPlayerAlphaFloat, offsetInt, offsetInt, buttonOpenClosePlayerObject, "Visitor");
}