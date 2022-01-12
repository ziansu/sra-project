public void deleteOffer(backend.Offer deletedOffer) {
    offers.remove(deletedOffer.getName());
    try {
        databaseConnector.deleteOffer(deletedOffer);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}