public double calculatePrice() {
    double price = (timeWorked) * 20;
    for (domain.inventory.Article a : articles) {
        price += a.getPrijs();
    }
    return price;
}