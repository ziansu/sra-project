private void calculateCost() {
    if ((move_type) == "Step") {
        (move_cost)++;
    }
    if ((move_type) == "Slide") {
        move_cost += 2;
    }
    if ((move_type) == "Jump") {
        (move_cost)++;
    }
}