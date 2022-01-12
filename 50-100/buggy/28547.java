private java.util.Set<org.thymeleaf.dialect.IDialect> orderDialects(java.util.Set<org.thymeleaf.dialect.IDialect> unorderedDialects) {
    java.util.Set<org.thymeleaf.dialect.IDialect> correct = new java.util.LinkedHashSet<>();
    org.thymeleaf.dialect.IDialect blcDialect = null;
    for (org.thymeleaf.dialect.IDialect d : unorderedDialects) {
        if (d instanceof org.broadleafcommerce.presentation.thymeleaf2.dialect.BLCDialect) {
            blcDialect = d;
        }else {
            correct.add(d);
        }
    }
    if (blcDialect != null) {
        correct.add(blcDialect);
    }
    return correct;
}