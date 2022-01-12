@org.springframework.transaction.annotation.Transactional
private ca.wasabistudio.chat.entity.Message saveMessage(ca.wasabistudio.chat.entity.Room room, ca.wasabistudio.chat.entity.Client client, ca.wasabistudio.chat.entity.Message message) {
    client.addMessage(message);
    room.addMessage(message);
    clientRepo.save(client);
    roomRepo.save(room);
    messageRepo.save(message);
    return message;
}