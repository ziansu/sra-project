public void deleteGroupOwned(com.moodmapper.entity.GroupEntity group) {
    if (this.groupsOwned.contains(group)) {
        this.groupsOwned.remove(group);
    }
}