@org.springframework.beans.factory.annotation.Autowired
private void setDiscount(test.onlinecafe.util.discount.Discount discount) {
    discount.init();
    test.onlinecafe.util.CoffeeOrderUtil.discount = discount;
}