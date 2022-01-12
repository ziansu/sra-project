@java.lang.Override
public void onClick(android.view.View v) {
    getFinalButtonAccessor().setBehaviour(new com.matthewtamlin.sliding_intro_screen_library.buttons.IntroButton.RequestPermissions(com.matthewtamlin.testapp.TestBehaviours.PERMISSIONS, com.matthewtamlin.testapp.TestBehaviours.PERM_REQUEST_CODE));
    getFinalButtonAccessor().setText("REQUEST PERMS", null);
}