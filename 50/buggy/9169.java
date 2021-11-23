@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.wimk.entity.Child addChild(com.wimk.entity.Child child) {
    child.setId((-1));
    child.setSendingFrequency(30);
    return childRepository.saveAndFlush(child);
}