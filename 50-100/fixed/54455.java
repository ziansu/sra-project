public double getOffersHighestPrice() {
    double result = 0;
    try {
        open();
        java.lang.System.out.print(">> DataAccess: getOffersHighestPrice() -> ");
        javax.persistence.TypedQuery<java.lang.Double> query = db.createQuery(("SELECT MAX(o.price) " + "FROM Offer o "), java.lang.Double.class).setMaxResults(1);
        result = query.getSingleResult();
        java.lang.System.out.println(result);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        close();
    }
    return result;
}