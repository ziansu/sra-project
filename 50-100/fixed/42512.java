public double pay(java.lang.String name) throws restaurantChain.InvalidName {
    if (!(prenotations.containsKey(name)))
        throw new restaurantChain.InvalidName();
    
    if (!(orders.containsKey(name)))
        return 0;
    
    double toPay = 0;
    for (java.lang.String m : orders.get(name)) {
        toPay += listing.get(m).getPrice();
    }
    paid.put(name, toPay);
    return toPay;
}