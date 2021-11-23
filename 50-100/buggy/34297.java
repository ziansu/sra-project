public boolean create(us.categorize.repository.Message message, java.lang.Long repliesToId) {
    if (!(create(message)))
        return false;
    
    us.categorize.repository.Tag repliesTo = new us.categorize.repository.Tag("repliesTo");
    read(repliesTo);
    return relate(message.getId(), repliesTo, repliesToId);
}