@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.wimk.entity.Parent addParent(com.wimk.entity.Parent parent) {
    parent.setRemovingFrequency(10);
    parent.setPassword(new com.wimk.secure.Sha512Encoder().encode(parent.getPassword()));
    return parentRepository.saveAndFlush(parent);
}