public boolean removeUser(Garage.User user) {
    Garage.User u = idToUser.get(user.getId());
    if (u == null)
        return false;
    else {
        for (Garage.Bicycle bike : u.getBicycles()) {
            removeBicycle(bike);
        }
        idToUser.remove(u.getId());
        pinToUser.remove(u.getPin());
        Garage.CodeGenerator.addPin(u.getPin());
        users.remove(u);
    }
    return true;
}