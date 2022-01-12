public static java.lang.String getBoardPostUrl(java.lang.String baseUrl, @com.drownedinsound.data.generatered.BoardPostList.BoardPostListType
java.lang.String boardListType, java.lang.String boardPostId) {
    java.lang.String boardPostUrl = com.drownedinsound.data.network.UrlConstants.getBoardPostListUrl(baseUrl, boardListType);
    if (!(com.drownedinsound.utils.StringUtils.isEmpty(boardPostUrl))) {
        boardPostUrl += boardPostId;
    }
    return boardPostUrl;
}