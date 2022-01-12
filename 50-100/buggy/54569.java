private void setType(robokill.PrizeType type) {
    this.type = type;
    switch (type) {
        case Energy :
            setImage("images/Prize energy.png");
            break;
        case Key :
            setImage("images/Prize key.png");
            break;
        case Money :
            setImage("images/Prize money.png");
            break;
        case Sheild :
            setImage("images/Prize shield.png");
            break;
        case Weapon :
            setImage("images/Prize weapon 1.png");
            break;
    }
}