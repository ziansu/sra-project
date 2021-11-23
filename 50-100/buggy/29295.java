public boolean saveMeal() {
    if ((((currentUser) != null) && ((currentUser.getRole()) == (enums.UserRole.Chef))) && ((currentMeal) != null)) {
        mapMeal.put(currentMeal.getName(), currentMeal);
        return true;
    }
    return false;
}