public void setValue(int newValue) {
    this.value = newValue;
    if ((currentState) == (pokinboroda.andriy.com.foxhunting.model.GameAreaField.States.SHOWED)) {
        changeState(pokinboroda.andriy.com.foxhunting.model.GameAreaField.States.SHOWED);
    }
}