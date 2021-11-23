public boolean updateGValue(Crossing newPreviousCrossing) {
    int linkIDPreviousToThis = getLinkIDPreviousToThis(newPreviousCrossing.id);
    double newGVal = (newPreviousCrossing.gVal) + (getLinkIDDriveTime(linkIDPreviousToThis));
    if (newGVal < (this.gVal)) {
        this.gVal = newGVal;
        return true;
    }
    return false;
}