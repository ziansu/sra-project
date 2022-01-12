public float getBurnTimeProgress() {
    if (((currentItemBurnTime) == 0) && ((furnaceBurnTime) > 0)) {
        return 1.0F;
    }
    return ((float) (furnaceBurnTime)) / ((float) (currentItemBurnTime));
}