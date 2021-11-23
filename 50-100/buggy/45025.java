public de.fhg.iais.roberta.persistence.bo.Group getGroup(java.lang.String groupName) {
    if (!(de.fhg.iais.roberta.util.Util1.isValidJavaIdentifier(groupName))) {
        setError(Key.GROUP_ERROR_NAME_INVALID, groupName);
        return null;
    }else {
        de.fhg.iais.roberta.persistence.dao.GroupDao groupDao = new de.fhg.iais.roberta.persistence.dao.GroupDao(this.dbSession);
        de.fhg.iais.roberta.persistence.bo.Group group = groupDao.loadGroup(groupName);
        if (group != null) {
            setSuccess(Key.GROUP_GET_ONE_SUCCESS);
            return group;
        }else {
            setError(Key.GROUP_GET_ONE_ERROR_NOT_FOUND);
            return null;
        }
    }
}