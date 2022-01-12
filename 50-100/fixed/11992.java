public void setCreepFactor(boolean creepFactor) {
    if (((minAge) <= (baeAge)) && ((maxAge) >= (baeAge))) {
        creepFactor = false;
    }else {
        creepFactor = true;
    }
    this.creepFactor = creepFactor;
}