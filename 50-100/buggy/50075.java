public com.github.kory33.signvote.model.Limit minus(com.github.kory33.signvote.model.Limit limit) {
    if (this.isInfinite()) {
        return new com.github.kory33.signvote.model.Limit(limit.limit);
    }
    if (limit.isInfinite()) {
        return new com.github.kory33.signvote.model.Limit(0);
    }
    return new com.github.kory33.signvote.model.Limit(java.lang.Math.max(((this.limit) - (limit.limit)), 0));
}