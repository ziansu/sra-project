@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<com.sgkhmjaes.jdias.domain.Message> findAllByConversation(com.sgkhmjaes.jdias.domain.Conversation conversation) {
    log.debug("Request to get all Messages");
    if (conversation.getParticipants().contains(getCurrentPerson())) {
        java.util.List<com.sgkhmjaes.jdias.domain.Message> messages = conversation.getMessages();
        org.hibernate.Hibernate.initialize(messages);
        return messages;
    }else
        return new java.util.ArrayList<>();
    
}