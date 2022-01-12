@fr.ippon.tatami.service.Before
public void setup() {
    fr.ippon.tatami.config.Constants.MODERATOR_STATUS = true;
    groupId = groupRepository.createGroup("ippon.fr", "test", "test", true, false);
    group = groupRepository.getGroupById("ippon.fr", groupId);
}