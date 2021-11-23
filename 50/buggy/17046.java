@java.lang.Override
public void onSuccess(com.willshex.blogwt.shared.api.user.call.ChangeUserDetailsResponse output) {
    getUserRequest = null;
    if ((output.status) == (com.willshex.gson.json.service.shared.StatusType.StatusTypeSuccess)) {
    }
    com.willshex.blogwt.client.DefaultEventBus.get().fireEventFromSource(new com.willshex.blogwt.shared.api.user.call.event.ChangeUserDetailsEventHandler.ChangeUserDetailsSuccess(input, output), this);
}