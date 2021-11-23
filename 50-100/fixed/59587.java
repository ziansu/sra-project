public void increasePrice(int percentage) {
    java.util.List<springmvc_ims.model.Product> products = productDao.queryAllAsList();
    if (products != null) {
        for (springmvc_ims.model.Product product : products) {
            double newPrice = ((product.getPrice().doubleValue()) * (100 + percentage)) / 100;
            product.setPrice(newPrice);
            productDao.update(product);
        }
    }
}