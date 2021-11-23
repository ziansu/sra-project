@org.springframework.transaction.annotation.Transactional
private void testData() {
    com.milkneko.example.model.Veterinary veterinary = veterinaryRepository.findAll().get(0);
    veterinary.getCustomer().size();
    for (com.milkneko.example.model.Customer customer : veterinary.getCustomer()) {
        java.lang.System.out.println(customer.getName());
        customer.getPet().size();
        for (com.milkneko.example.model.Pet pet : customer.getPet()) {
            java.lang.System.out.println(pet.getName());
        }
    }
}