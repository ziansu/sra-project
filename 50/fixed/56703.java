private boolean isReservedByVip() throws java.lang.IllegalStateException {
    for (pl.com.bottega.photostock.sales.model.Client client : reservedPer) {
        if (client.isVip())
            throw new java.lang.IllegalStateException("Zdjęcie jest zarezerwowane przez klienta o statusie VIP.");
        
    }
    return false;
}