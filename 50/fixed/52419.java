public void setValue(int newValue) {
    this.value = newValue;
    if ((this.currentState) == (pokinboroda.andriy.com.foxhunting.model.GameAreaField.States.SHOWED)) {
        setState(pokinboroda.andriy.com.foxhunting.model.GameAreaField.States.SHOWED);
    }
}