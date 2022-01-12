@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.wimk.entity.Parent addParent(com.wimk.entity.Parent parent) {
    parent.setPassword(new com.wimk.secure.Sha512Encoder().encode(parent.getPassword()));
    return parentRepository.saveAndFlush(parent);
}