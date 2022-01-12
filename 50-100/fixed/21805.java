public boolean isEmpty() {
    boolean queryDefined = (org.silverpeas.core.util.StringUtil.isDefined(query)) || ((getMultiFieldQuery()) != null);
    boolean xmlQueryDefined = (getXmlQuery()) != null;
    boolean filtersDefined = ((isSearchBySpace()) || (isSearchByComponentType())) || (org.silverpeas.core.util.StringUtil.isDefined(getRequestedAuthor()));
    filtersDefined = filtersDefined || (isPeriodDefined());
    return ((!queryDefined) && (!xmlQueryDefined)) && (!filtersDefined);
}