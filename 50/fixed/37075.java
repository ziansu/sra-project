@java.lang.Override
public boolean canBeRidden() {
    return ((isLocomotive()) || (isPassenger())) || (isWorkCart());
}