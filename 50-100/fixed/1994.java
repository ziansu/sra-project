public java.util.List<model.Vehicle.Vehicle> getRegisteredUserVehicles() {
    if (((registeredUsers) != null) && ((loggedUser.ownedVehicles.size()) <= 1)) {
        for (model.UserManager.User user : registeredUsers) {
            if (user.name.equals(loggedUser.name)) {
                return new java.util.ArrayList(user.ownedVehicles);
            }
        }
    }else {
        return new java.util.ArrayList(loggedUser.ownedVehicles);
    }
    return null;
}