@java.lang.Override
public boolean remove(com.ivstuart.tmud.person.carried.Money money) {
    if ((money.type) != (type)) {
        return false;
    }
    if ((money.quantity) > (quantity)) {
        return false;
    }
    com.ivstuart.tmud.person.carried.Money.LOGGER.debug(((("Current quantity is " + (quantity)) + " new quantity is ") + ((quantity) - (money.quantity))));
    quantity -= money.quantity;
    return true;
}