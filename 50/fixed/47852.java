@javax.transaction.Transactional
@java.lang.Override
public boolean checkIfMemberExistsInChatroom(java.lang.Long member_id, java.lang.Long room_id) {
    return (repository.findByRoomIdAndMember(room_id, member_id)) != null;
}