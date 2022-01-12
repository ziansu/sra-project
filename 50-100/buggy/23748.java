public boolean isValid() {
    if ((((((getHorsePower()) <= 0) || (getBrand().equals(""))) || (getModel().equals(""))) || ((getModel()) == null)) || ((getBrand()) == null)) {
        return false;
    }else {
        return true;
    }
}