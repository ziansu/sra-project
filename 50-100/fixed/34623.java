public D insert(D dto) {
    if (dto == null) {
        return null;
    }
    org.sonar.db.DbSession session = this.getDbSession();
    try {
        getMapper(session).insert(dto);
        session.commit();
        return dto;
    } finally {
        org.sonar.db.MyBatis.closeQuietly(session);
    }
}