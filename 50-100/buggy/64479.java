public void updateProduct(java.lang.String id, com.grouptwo.zalada.stockmanage.domain.Product updateProduct) {
    java.lang.Long timestamp = getTimeStamp();
    updateProduct.setCategory(findCategoryHierachy(updateProduct.getCategory().getName()));
    org.springframework.data.mongodb.core.query.Update update = updateWithReflect(com.grouptwo.zalada.stockmanage.domain.Product.class, updateProduct);
    update.set("editDate", timestamp);
    mongoTemplete.updateFirst(queryById(id), update, com.grouptwo.zalada.stockmanage.domain.Product.class);
}