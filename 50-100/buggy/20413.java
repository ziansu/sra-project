public void add(java.lang.String clientNr, java.lang.String productNr) {
    pl.com.bottega.photostock.sales.api.Client client = clientRepository.load(clientNr);
    pl.com.bottega.photostock.sales.api.Reservation reservation = reservationRepository.load(client);
    pl.com.bottega.photostock.sales.api.Product product = productRepository.load(productNr);
    if (reservation.isClosed()) {
        java.lang.String reservationNr = createReservation(clientNr);
        reservation = reservationRepository.load(reservationNr);
    }
    product.reservePer(client);
    reservation.add(product);
    reservationRepository.save(reservation);
    productRepository.save(product);
}