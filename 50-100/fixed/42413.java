private void fish() {
    if (inFishingArea()) {
        org.osbot.rs07.api.model.NPC fishingSpot = npcs.closest(Fisher.CAGE_HARPOON_FISH_SPOT);
        if (fishingSpot != null) {
            fishingSpot.interact("Harpoon");
            state = Fisher.State.WAIT;
        }else {
            goToNextFishingArea();
        }
    }else {
        goToNextFishingArea();
    }
}