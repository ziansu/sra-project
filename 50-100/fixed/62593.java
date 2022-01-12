public boolean isArchivedBy(models.User user) {
    if (this.messages.isEmpty()) {
        return true;
    }
    if ((this.user1.id) == (user.id)) {
        return ((user1ArchiveDate) != null) && ((user1ArchiveDate.getTime()) >= (lastMessageDate.getTime()));
    }else {
        return ((user2ArchiveDate) != null) && ((user2ArchiveDate.getTime()) >= (lastMessageDate.getTime()));
    }
}