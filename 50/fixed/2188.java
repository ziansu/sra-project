public static void setCapital(Entities.Property obj) {
    for (int i = 0; i < ((Accounting.accountingAsset.yearsToPayOffBond) + 1); i++) {
        Accounting.accountingAsset.fixedAsset[i] = Accounting.accountingAsset.propertyValue;
    }
}