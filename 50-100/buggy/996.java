public static Flippable doubleFlip(Flippable f1) {
    int side = f1.getUpSide();
    Coin c;
    switch (side) {
        case 0 :
            c = new Penny();
            break;
        case 1 :
            c = new Nickel();
            break;
        default :
            c = new Coin(0.0, "some other coin");
            break;
    }
    return c;
}