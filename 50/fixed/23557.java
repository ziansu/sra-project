@java.lang.Override
public boolean rentCar(rental.Customer c) {
    if ((rented) != null) {
        return false;
    }
    rented = c;
    return true;
}