public void addItem(payments.stone.com.br.desafiomobile.model.Product product, int quantity) {
    for (payments.stone.com.br.desafiomobile.model.CartItem item : items) {
        if (item.getProduct().equals(product)) {
            if (quantity == 0) {
                items.remove(item);
                totalAmount = 0;
            }
            item.setCount(quantity);
            totalAmount = 0;
            return ;
        }
    }
    totalAmount = 0;
    items.add(new payments.stone.com.br.desafiomobile.model.CartItem(product).setCount(quantity));
}