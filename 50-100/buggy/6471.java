public double getOffersLowestPrice() {
    double result = 0.0F;
    try {
        open();
        java.lang.System.out.println(">> DataAccess: getOfferLowestPrice() -> ");
        javax.persistence.TypedQuery<java.lang.Double> query = db.createQuery(("SELECT MIN(o.price) " + "FROM Offer o "), java.lang.Double.class).setMaxResults(1);
        result = query.getSingleResult();
        java.lang.System.out.print(result);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        close();
    }
    return result;
}