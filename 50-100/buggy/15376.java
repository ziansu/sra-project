public boolean removeUser(Garage.User user) {
    Garage.User u = idToUser.get(user.getId());
    if (u == null)
        return false;
    else {
        idToUser.remove(u.getId());
        pinToUser.remove(u.getPin());
        Garage.CodeGenerator.addPin(u.getPin());
        users.remove(u);
        for (Garage.Bicycle bike : u.getBicycles()) {
            removeBicycle(bike);
        }
    }
    return true;
}