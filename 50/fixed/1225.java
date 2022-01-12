public boolean isForeignKey() {
    if (!(relationshipList.isEmpty())) {
        return true;
    }
    return false;
}