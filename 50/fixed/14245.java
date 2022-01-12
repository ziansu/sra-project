public pl.com.bottega.photostock.sales.model.Money calculateTotalCost() {
    pl.com.bottega.photostock.sales.model.Money totalCost = new pl.com.bottega.photostock.sales.model.Money(0);
    for (pl.com.bottega.photostock.sales.model.Product product : items)
        totalCost = totalCost.add(product.getPrice());
    
    return totalCost;
}