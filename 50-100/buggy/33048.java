public static entity.Customer toEntity(dto.CustomerDTO customerDTO) {
    entity.Customer customer = new entity.Customer();
    customer.setId(customerDTO.getId());
    customer.setName(customerDTO.getName());
    customer.setPhone(customerDTO.getPhone());
    customer.setSignature(customerDTO.getSignature());
    customer.setHeadPortrait(customerDTO.getHeadPortrait());
    return customer;
}