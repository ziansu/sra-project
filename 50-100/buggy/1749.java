public void RemoveUserEntry(java.util.UUID... uuid) {
    for (int i = (completeUsers.size()) - 1; i >= 0; i--) {
        betterquesting.quests.QuestInstance.UserEntry entry = completeUsers.get(i);
        if (entry.uuid.equals(uuid)) {
            completeUsers.remove(i);
            UpdateClients();
        }
    }
}