public void remove(libraryClasses.Player p) {
    for (int i = 0; i < (positionArray.length); i++) {
        if (positionArray[i].equals(p)) {
            positionArray[i] = null;
        }
    }
}