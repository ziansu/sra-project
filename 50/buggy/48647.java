public void setCategory(model.Category category) {
    model.Transaction.checkCategory(category);
    this.category = category;
}