@java.lang.Override
public void onClick(final android.view.View v) {
    if (!(hostInput.isValid())) {
        hostInput.requestFocus();
        return ;
    }
    final android.app.Activity activity = getActivity();
    if (activity instanceof co.cutely.asim.registration.RegistrationActivity) {
        final java.lang.String handle = handleInput.getValue();
        final java.lang.String host = hostInput.getValue();
        final int port = java.lang.Integer.parseInt(portInput.getValue());
        ((co.cutely.asim.registration.RegistrationActivity) (activity)).complete(handle, host, port);
    }
}