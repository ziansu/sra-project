@java.lang.Override
public com.example.jonatan.clothesplanner.wardrobe.wardrobeitem.IWardrobeItem getShirt() {
    if (((currentShirt) + 1) > (wardrobe.getShirts().size())) {
        currentShirt = 0;
    }
    com.example.jonatan.clothesplanner.wardrobe.wardrobeitem.IWardrobeItem shirt = wardrobe.getShirts().get(currentShirt);
    (currentShirt)++;
    return shirt;
}