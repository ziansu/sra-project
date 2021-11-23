@java.lang.Override
public void save(pl.com.bottega.photostock.sales.model.Purchase purchase) {
    if ((purchase.getNumber()) == null) {
        purchase.setNumber(java.util.UUID.randomUUID().toString());
    }
    pl.com.bottega.photostock.sales.infrastructure.repositories.FakePurchaseRepository.fakeDatabase.put(purchase.getNumber(), purchase);
}