public void setParentCategory(model.Category parentCategory) {
    model.Category.checkDiffParentCategory(this.description, parentCategory);
    this.parentCategory = parentCategory;
}