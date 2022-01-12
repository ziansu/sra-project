private void calculateCost() {
    if ((move_type) == "Step") {
        java.lang.System.out.println("step move");
        (move_cost)++;
    }
    if ((move_type) == "Slide") {
        java.lang.System.out.println("slide move");
        move_cost += 2;
    }
    if ((move_type) == "Jump") {
        java.lang.System.out.println("slide move");
        (move_cost)++;
    }
}