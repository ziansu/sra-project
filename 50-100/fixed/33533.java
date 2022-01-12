public void addComment(java.lang.String body) {
    sitecreators.utils.comment.Comment comment = new sitecreators.utils.comment.Comment();
    comment.setBody(body);
    comment.setPublishTime(new java.sql.Timestamp(new java.util.Date().getTime()));
    this.product.addComment(comment);
    productDao.updateProduct(product);
}