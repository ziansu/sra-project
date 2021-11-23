@java.lang.Override
public com.dynamicheart.raven.model.user.User populate(@javax.validation.constraints.NotNull
com.dynamicheart.raven.controller.app.user.field.UpdateUserForm updateUserForm, @javax.validation.constraints.NotNull
com.dynamicheart.raven.model.user.User user) throws com.dynamicheart.raven.utils.exception.ConversionException {
    if ((updateUserForm.getUsername()) != null) {
        user.setUsername(updateUserForm.getUsername());
    }
    if ((updateUserForm.getEmail()) != null) {
        user.setEmail(updateUserForm.getEmail());
    }
    if ((updateUserForm.getPhoneNumber()) != null) {
        user.setPhoneNumber(updateUserForm.getPhoneNumber());
    }
    return user;
}