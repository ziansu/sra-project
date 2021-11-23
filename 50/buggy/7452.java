public void setParentAuthor(eu.bittrade.libs.steemj.base.models.AccountName parentAuthor) {
    this.parentAuthor = parentAuthor;
    addRequiredPrivateKeyType(parentAuthor, PrivateKeyType.POSTING);
}