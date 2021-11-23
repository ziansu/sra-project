@java.lang.Override
public void update(com.luxoft.wheretogo.models.Group group, java.lang.String ownerEmail) {
    com.luxoft.wheretogo.models.Group oldGroup = initGroupParticipants(group);
    com.luxoft.wheretogo.models.User owner;
    if (oldGroup != null) {
        owner = oldGroup.getOwner();
        if (!(owner.getEmail().equals(ownerEmail))) {
            return ;
        }
        group.setOwner(owner);
        if ((group.getGroupParticipants()) == null) {
            group.setGroupParticipants(oldGroup.getGroupParticipants());
        }
    }
    groupsRepository.merge(group);
}