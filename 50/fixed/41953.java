@com.fasterxml.jackson.annotation.JsonIgnore
public com.ua.cabare.domain.Money getOrdersCost() {
    com.ua.cabare.domain.Money cost = com.ua.cabare.domain.Money.ZERO;
    for (com.ua.cabare.models.OrderItem orderItem : this.getOrderItems()) {
        cost = cost.add(orderItem.getTotalPrice());
    }
    return cost;
}