@java.lang.Override
public void onClick(android.view.View v) {
    android.os.Bundle args = new android.os.Bundle();
    args.putBoolean(ComposeFragment.ARG_SHOW_KEYBOARD, false);
    args.putString(ComposeFragment.ARG_FOCUS, ComposeFragment.FOCUS_RECIPIENTS);
    android.app.Fragment content = getFragmentManager().findFragmentById(R.id.content_frame);
    switchFragment(com.adeebnqo.Thula.ui.compose.ComposeFragment.getInstance(args, content));
}