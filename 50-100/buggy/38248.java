public com.d401f17.TypeSystem.Type getMemberType(java.lang.String id) throws com.d401f17.TypeSystem.MemberNotFoundException {
    if (members.containsKey(id)) {
        return members.get(id);
    }else {
        throw new com.d401f17.TypeSystem.MemberNotFoundException(((("Record " + (name)) + " does not contain member ") + id));
    }
}