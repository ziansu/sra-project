public java.lang.String fireDrill() {
    setStress(((getStress()) - 5));
    setEnergy(((getEnergy()) - 5));
    time += 2;
    return "There is a fire drill during class which ends up taking the entire period. I guess you're not going to that class today!";
}