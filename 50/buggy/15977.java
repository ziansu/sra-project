public static com.pratilipi.data.client.AuthorData createAuthorData(com.pratilipi.data.type.Author author) {
    return com.pratilipi.data.util.AuthorDataUtil.createAuthorData(author, com.pratilipi.data.DataAccessorFactory.getDataAccessor().getPage(PageType.AUTHOR, author.getId()));
}