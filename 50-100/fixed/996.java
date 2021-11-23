public static Flippable doubleFlip(Flippable f1) {
    int side = f1.getUpSide();
    Coin c = new Penny();
    switch (side) {
        case 0 :
            c = new Penny();
            break;
        case 1 :
            c = new Nickel();
            break;
    }
    return c;
}