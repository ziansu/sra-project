public static com.pratilipi.data.client.AuthorData createAuthorData(com.pratilipi.data.type.Author author) {
    if (author == null)
        return null;
    
    return com.pratilipi.data.util.AuthorDataUtil.createAuthorData(author, com.pratilipi.data.DataAccessorFactory.getDataAccessor().getPage(PageType.AUTHOR, author.getId()));
}