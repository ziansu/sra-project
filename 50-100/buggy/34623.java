public D insert(D dto) {
    org.sonar.db.DbSession session = this.getDbSession();
    try {
        getMapper(session).insert(dto);
        session.commit();
        return dto;
    } finally {
        org.sonar.db.MyBatis.closeQuietly(session);
    }
}