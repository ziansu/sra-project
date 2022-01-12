@java.lang.Override
public com.github.pagehelper.PageInfo<cn.edu.nju.software.entity.Works> getWorksListByStoryIdListByPage(java.util.List<java.lang.Integer> storyIdList, int page, int pageSize) {
    com.github.pagehelper.PageHelper.startPage(page, pageSize);
    storyIdList.add((-1));
    java.util.List<cn.edu.nju.software.entity.Works> workList = worksDao.getWorksListByStoryIdList(storyIdList);
    com.github.pagehelper.PageInfo<cn.edu.nju.software.entity.Works> pageInfo = new com.github.pagehelper.PageInfo(workList);
    return pageInfo;
}