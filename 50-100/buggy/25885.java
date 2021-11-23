public boolean hit(int amount, boolean planetCollision) {
    if (!planetCollision) {
        if ((getShieldCharge()) > 0) {
            reduceShieldCharge();
            return false;
        }else {
            hitpoints -= amount;
            return (hitpoints) > 0;
        }
    }else {
        isAlive = false;
        setPos(position.x, position.y);
        return true;
    }
}