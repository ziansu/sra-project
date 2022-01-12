public static java.lang.String processSearchCondition(java.lang.String searchCondition) {
    if (org.exoplatform.forum.common.CommonUtils.isEmpty(searchCondition)) {
        return searchCondition;
    }
    java.lang.StringBuilder searchConditionBuffer = new java.lang.StringBuilder();
    searchCondition = org.exoplatform.forum.common.CommonUtils.removeSpecialCharacterForSearch(searchCondition);
    searchCondition = searchCondition.replace(org.exoplatform.forum.common.CommonUtils.ASTERISK_STR, org.exoplatform.forum.common.CommonUtils.PERCENT_STR);
    searchConditionBuffer.append(org.exoplatform.forum.common.CommonUtils.PERCENT_STR).append(searchCondition).append(org.exoplatform.forum.common.CommonUtils.PERCENT_STR);
    return searchConditionBuffer.toString();
}