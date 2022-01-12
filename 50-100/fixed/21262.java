@java.lang.Override
public void onClick(android.view.View view) {
    clearResponseTextView();
    boolean isEmpty = (mNodeIdEditText.length()) == 0;
    if (!isEmpty) {
        int nodeId = java.lang.Integer.parseInt(mNodeIdEditText.getText().toString());
        java.lang.String controllerId = mControllerIdEditText.getText().toString();
        com.homesky.homecloud.command.RemoveNodeCommand command = new com.homesky.homecloud.command.RemoveNodeCommand(nodeId, controllerId);
        new com.homesky.homecloud.MainActivityFragment.RequestTask().execute(command);
    }
}