public com.nhnent.edu.model.Member exists(java.lang.String name) {
    return sqlSessionTemplate.selectOne("memberDao.existsMember", name);
}