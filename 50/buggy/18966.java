public void onEvent(blueprint.com.sage.events.sessions.ResetPasswordEvent event) {
    android.widget.Toast.makeText(getActivity(), event.getApiSuccess().getMessage(), Toast.LENGTH_SHORT);
    blueprint.com.sage.utility.view.FragUtils.popBackStack(this);
}