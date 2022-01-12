public void addPizza(com.preproduction.delivery.domain.Pizza pizza) {
    if ((orderSize) < (com.preproduction.delivery.domain.Order.MAX_ORDER_SIZE)) {
        (orderSize)++;
        for (com.preproduction.delivery.domain.OrderDetails od : pizzas) {
            if (od.getPizza().equals(pizza)) {
                od.setQuantity(((od.getQuantity()) + 1));
                return ;
            }
        }
        pizzas.add(new com.preproduction.delivery.domain.OrderDetails(pizza, 1, this));
    }
}