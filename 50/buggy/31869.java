public edu.carleton.comp4601.project.dao.Product parseProductOfType(edu.carleton.comp4601.project.dao.ProductType type) {
    edu.carleton.comp4601.project.dao.Product product = null;
    if ((retailer.getName()) == (edu.carleton.comp4601.project.dao.RetailerName.NCIX)) {
        product = parseNCIXProduct(type);
    }
    return product;
}