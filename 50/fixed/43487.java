public int findBySoldto(com.nekretnine.models.Customer customer) {
    return repository.findBySoldto(customer.getId());
}