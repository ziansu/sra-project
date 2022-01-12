public void addItem(payments.stone.com.br.desafiomobile.model.Product product, int quantity) {
    for (payments.stone.com.br.desafiomobile.model.CartItem item : items) {
        if (item.getProduct().equals(product)) {
            item.setCount(quantity);
            return ;
        }
    }
    totalAmount = 0;
    items.add(new payments.stone.com.br.desafiomobile.model.CartItem(product).setCount(quantity));
}