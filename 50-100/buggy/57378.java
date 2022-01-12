public com.czbix.v2ex.model.Node createNode() {
    try {
        return com.czbix.v2ex.model.Node.Builder.CACHE.get(mName, () -> new com.czbix.v2ex.model.Node(mTitle, mId, mAvatar, mName, mTitleAlternative, mTopics));
    } catch (java.util.concurrent.ExecutionException e) {
        throw new com.czbix.v2ex.common.exception.FatalException(e);
    }
}