private void startOrder() {
    ca.we_love_different_things.bubbletea.OrderModel.stage = 0;
    if (match)
        (points)++;
    else
        (points)--;
    
    order.clear();
    findIngredients();
}