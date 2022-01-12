void setOneTypeOfHeroOnly() {
    if ((generateRandomNumber()) > 95) {
        oneTypeOfHeroOnly = true;
        setWhichTypeOfHeroOnly();
    }
}