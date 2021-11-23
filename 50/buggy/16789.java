public java.lang.String getBook(java.lang.String isbn) throws datasource.DatabaseException {
    java.lang.String memberName = null;
    datasource.MemberRowDataGatewayMock memberRowDataGatewayMock = new datasource.MemberRowDataGatewayMock(memberName);
    return memberRowDataGatewayMock.addMemberName();
}