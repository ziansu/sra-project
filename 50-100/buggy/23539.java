@java.lang.Override
public org.sanelib.eboss.core.commands.ProcessCommand convert(org.sanelib.eboss.api.dto.user.UserDTO userDTO, org.sanelib.eboss.core.exceptions.ProcessError processError) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    org.sanelib.eboss.core.commands.user.AddUser addUser = ((org.sanelib.eboss.core.commands.user.AddUser) (super.convert(userDTO, processError)));
    org.sanelib.eboss.core.commands.user.UpdateUser updateUser = new org.sanelib.eboss.core.commands.user.UpdateUser();
    org.sanelib.eboss.common.utils.ReflectionHelper.copy(addUser, updateUser);
    if (com.google.common.base.Strings.isNullOrEmpty(userDTO.getId())) {
        processError.addError("common.field.required", "id", "domain.user.id");
    }else {
        updateUser.setId(java.lang.Integer.valueOf(userDTO.getId()));
    }
    return updateUser;
}