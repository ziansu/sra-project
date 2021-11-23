public void addProductPackage(BasicCommonClasses.ProductPackage p) {
    BasicCommonClasses.SmartCode sc = p.getSmartCode();
    BasicCommonClasses.ProductPackage inCartProductPackage = packages.get(sc);
    if (inCartProductPackage != null) {
        inCartProductPackage.incrementAmount(p.getAmount());
        packages.put(sc, inCartProductPackage);
    }else
        packages.put(sc, p);
    
    totalAmount += p.getAmount();
}