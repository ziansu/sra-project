public void GenerateObject(control.Position objectPos) {
    control.Food_Drink newItem = new control.Food_Drink(objectPos.x, 0, new control.Food_Drink().RandomType());
    this.currGameState.addFallingObjects(newItem);
}