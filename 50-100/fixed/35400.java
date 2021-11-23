public boolean compareDreams(com.rafaelfelipeac.sweetdreams.models.Dream dreamA, com.rafaelfelipeac.sweetdreams.models.Dream dreamB) {
    if ((dreamA != null) && (dreamB != null)) {
        return ((dreamA.getTitle().equals(dreamB.getTitle())) && (dreamA.getDescription().equals(dreamB.getDescription()))) && (dreamA.getTags().equals(dreamB.getTags()));
    }
    return false;
}