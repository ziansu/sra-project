int getName() {
    boolean nameExist = true;
    int newName = 1;
    while (nameExist) {
        int randomNum1to1000 = 1 + (new java.util.Random().nextInt(1000));
        newName = randomNum1to1000;
        if (!(com.codecool.Truck.usedNames.contains(newName))) {
            com.codecool.Truck.usedNames.add(newName);
            nameExist = false;
        }
    } 
    return newName;
}