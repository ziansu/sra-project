@java.lang.Override
@javax.jws.WebMethod
public java.util.List<com.softserve.tc.diary.entity.Record> getAllPublicRecordsByNickName(java.lang.String nickName) {
    com.softserve.tc.diary.entity.User user = userDAO.readByNickName(nickName);
    java.util.List<com.softserve.tc.diary.entity.Record> list = recordDAO.getRecordByUserId(user.getUuid());
    java.util.Collections.sort(list, new java.util.Comparator<com.softserve.tc.diary.entity.Record>() {
        @java.lang.Override
        public int compare(com.softserve.tc.diary.entity.Record o1, com.softserve.tc.diary.entity.Record o2) {
            return (o2.getCreatedTime().getTime()) > (o1.getCreatedTime().getTime()) ? 1 : -1;
        }
    });
    return list;
}