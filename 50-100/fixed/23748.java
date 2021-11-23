public boolean isValid() {
    return !((((((getHorsePower()) <= 0) || (getBrand().isEmpty())) || (getModel().isEmpty())) || ((getModel()) == null)) || ((getBrand()) == null));
}