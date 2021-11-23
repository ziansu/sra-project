public void setAdditiveToChoose(foodselector.domain.DishAdditive additiveToChoose) {
    this.additiveToChoose = additiveToChoose;
    if (additiveToChoose instanceof foodselector.domain.Potato) {
        setPickedAdditive(additiveToChoose);
    }
}