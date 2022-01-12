@java.lang.Override
public void save(pl.com.bottega.photostock.sales.model.Purchase purchase) {
    if ((pl.com.bottega.photostock.sales.model.Purchase.getNumber()) == null) {
        purchase.setNumber(java.util.UUID.randomUUID().toString());
    }
    pl.com.bottega.photostock.sales.infrastructure.repositories.FakePurchaseRepository.fakeDatabase.put(pl.com.bottega.photostock.sales.model.Purchase.getNumber(), purchase);
}