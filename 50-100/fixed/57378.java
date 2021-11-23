public com.czbix.v2ex.model.Node createNode() {
    try {
        if ((mTitle) == null) {
            return new com.czbix.v2ex.model.Node(null, mId, mAvatar, mName, mTitleAlternative, mTopics);
        }
        return com.czbix.v2ex.model.Node.Builder.CACHE.get(mName, () -> new com.czbix.v2ex.model.Node(mTitle, mId, mAvatar, mName, mTitleAlternative, mTopics));
    } catch (java.util.concurrent.ExecutionException e) {
        throw new com.czbix.v2ex.common.exception.FatalException(e);
    }
}