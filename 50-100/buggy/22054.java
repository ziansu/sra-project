@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<com.sgkhmjaes.jdias.domain.Message> findAllByConversation(com.sgkhmjaes.jdias.domain.Conversation conversation) {
    log.debug("Request to get all Messages");
    if (conversation.getParticipants().contains(getCurrentPerson())) {
        java.util.List<com.sgkhmjaes.jdias.domain.Message> messages = conversation.getMessages();
        org.hibernate.Hibernate.initialize(messages);
        java.util.Collections.sort(messages, (com.sgkhmjaes.jdias.domain.Message m1,com.sgkhmjaes.jdias.domain.Message m2) -> m2.getCreatedAt().compareTo(m1.getCreatedAt()));
        return messages;
    }else
        return new java.util.ArrayList<>();
    
}