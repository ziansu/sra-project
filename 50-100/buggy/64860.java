@java.lang.Override
public void setUp() throws java.lang.Exception {
    super.setUp();
    java.lang.System.setProperty("dexmaker.dexcache", getContext().getCacheDir().getPath());
    storage = org.mockito.Mockito.mock(eu.tobiasheine.bitcoinwatcher.dao.storage.Storage.class);
    handheldNotifications = org.mockito.Mockito.mock(eu.tobiasheine.bitcoinwatcher.price_sync.notifications.HandheldNotifications.class);
    wearableNotifications = org.mockito.Mockito.mock(eu.tobiasheine.bitcoinwatcher.price_sync.notifications.WearableNotifications.class);
    settings = org.mockito.Mockito.mock(eu.tobiasheine.bitcoinwatcher.settings.Settings.class);
    priceUpdater = new eu.tobiasheine.bitcoinwatcher.price_sync.BitcoinPriceHandler(storage, handheldNotifications, settings, wearableNotifications);
}