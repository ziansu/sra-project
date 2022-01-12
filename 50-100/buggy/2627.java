@java.lang.Override
public com.example.jonatan.clothesplanner.wardrobe.wardrobeitem.IWardrobeItem getTrousers() {
    if (((currentTrousers) + 1) > (wardrobe.getTrousers().size())) {
        currentTrousers = 0;
    }
    com.example.jonatan.clothesplanner.wardrobe.wardrobeitem.IWardrobeItem trousers = wardrobe.getTrousers().get(currentTrousers);
    (currentTrousers)++;
    return trousers;
}