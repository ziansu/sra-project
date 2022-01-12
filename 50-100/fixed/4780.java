public void addNumberOfFish(models.Fish typeOfFish, long numberOfFish) {
    if (this.fishes.contains(typeOfFish)) {
        this.getFishCount(typeOfFish).addCount(numberOfFish);
        this.getFishCount(typeOfFish).update();
    }else {
        this.fishes.add(typeOfFish);
        this.fishCounts.add(new models.FishCount(this, typeOfFish.getId(), numberOfFish));
        typeOfFish.addLocation(this);
        typeOfFish.update();
    }
}