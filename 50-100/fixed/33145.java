@java.lang.Override
public void onClick(android.view.View view) {
    clearResponseTextView();
    boolean isEmpty = (mNodeIdEditText.length()) == 0;
    if (!isEmpty) {
        int nodeId = java.lang.Integer.parseInt(mNodeIdEditText.getText().toString());
        java.lang.String controllerId = mControllerIdEditText.getText().toString();
        int accept = 1;
        com.homesky.homecloud.command.AcceptNodeCommand command = new com.homesky.homecloud.command.AcceptNodeCommand(nodeId, controllerId, accept);
        new com.homesky.homecloud.MainActivityFragment.RequestTask().execute(command);
    }
}