@java.lang.Override
public java.util.List<java.lang.Integer> getStoryIdListByTagIdList(java.util.List<java.lang.Integer> tagIds) {
    return tagRelationDao.getStoryIdListByTagIdList(tagIds);
}