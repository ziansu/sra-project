private Ship.Cargo getRandomCargo() {
    int choose = ((randomizer.nextInt()) % ((CARGO_UPPER_BOUND) - (CARGO_LOWER_BOUND))) + (CARGO_LOWER_BOUND);
    switch (choose) {
        case 1 :
            {
                return Cargo.OIL;
            }
        case 2 :
            {
                return Cargo.GAS;
            }
        case 3 :
            {
                return Cargo.FOOD;
            }
        case 4 :
            {
                return Cargo.CARS;
            }
        default :
            {
                return Cargo.OIL;
            }
    }
}