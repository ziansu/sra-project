@java.lang.Override
public java.util.List<cn.edu.nju.software.entity.Story> getStoryListByTitle(java.lang.String title, int offset, int limit) {
    offset = (offset < 0) ? cn.edu.nju.software.util.Const.DEFAULT_OFFSET : offset;
    limit = (limit < 0) ? cn.edu.nju.software.util.Const.DEFAULT_LIMIT : limit;
    return storyDao.getStoryListByTitle(title, offset, limit);
}