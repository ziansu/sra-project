public boolean isReadBy(models.User user) {
    if ((this.user1.id) == (user.id)) {
        return ((user1ReadDate) == null) || ((user1ReadDate.getTime()) >= (lastMessageDate.getTime()));
    }else {
        return ((user2ReadDate) == null) || ((user2ReadDate.getTime()) >= (lastMessageDate.getTime()));
    }
}