@java.lang.Override
public java.lang.String execute() {
    user = service.user.GetUserByIdService.execute(userId);
    return SUCCESS;
}