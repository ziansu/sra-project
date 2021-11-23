public void setPizza2(Pizza pizza2) {
    if ((num_pizzas) >= 2) {
        pizzas[1] = pizza2;
    }
    if ((num_pizzas) < 2) {
        num_pizzas = 2;
    }
}