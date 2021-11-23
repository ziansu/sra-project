public com.eprosima.idl.parser.typecode.UnionMember getDefaultMember() {
    if ((this.m_defaultindex) != (-1)) {
        return ((com.eprosima.idl.parser.typecode.UnionMember) (getMembers().get(m_defaultindex)));
    }else {
        return null;
    }
}