public java.lang.Boolean isComplete() {
    return !(org.apache.commons.lang3.StringUtils.isAnyEmpty(title, author, isbn));
}