public net.dv8tion.jda.core.requests.restaction.pagination.ReactionPaginationAction getUsers(int amount) {
    return new net.dv8tion.jda.core.requests.restaction.pagination.ReactionPaginationAction(getJDA(), this).limit(amount);
}