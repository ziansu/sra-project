public void RemoveUserEntry(java.util.UUID... uuid) {
    for (int i = (completeUsers.size()) - 1; i >= 0; i--) {
        betterquesting.quests.QuestInstance.UserEntry entry = completeUsers.get(i);
        for (int k = 0; k < (uuid.length); k++) {
            if (entry.uuid.equals(uuid[k])) {
                completeUsers.remove(i);
                UpdateClients();
                break;
            }
        }
    }
}