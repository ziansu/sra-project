@java.lang.Override
public void acceptAttribute(com.ibm.team.workitem.common.model.IAttribute attribute) {
    com.ibm.team.workitem.common.model.Identifier<com.ibm.team.workitem.common.model.ILiteral> identifier = getValue(attribute);
    if (identifier != null) {
        value = identifier.getStringIdentifier();
    }
}