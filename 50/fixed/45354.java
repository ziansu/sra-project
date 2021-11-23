public void setProducts(java.util.TreeSet<farm.data.Product> products) {
    this.products = products;
    if ((this.products) != null)
        updateIncomeAndTotal();
    
}