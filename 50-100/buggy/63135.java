@java.lang.Override
public void saveMember(model.LibraryMember member) throws java.lang.Exception {
    dao.service.DataAccess dataAccess = new dao.Impl.DataAccessFacade();
    java.util.HashMap<java.lang.String, model.LibraryMember> memberMap = dataAccess.readMemberMap();
    java.lang.String memberId = member.getMemberId();
    memberMap.put(memberId, member);
    dao.Impl.DataAccessFacade.saveToStorage(StorageType.MEMBERS, member);
    java.lang.System.out.println(dao.Impl.DataAccessFacade.readFromStorage(StorageType.MEMBERS));
}