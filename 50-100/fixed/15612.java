public void onClick(android.content.DialogInterface dialog, int item) {
    java.lang.String strSelection = ((java.lang.String) (items[item]));
    java.lang.CharSequence[] tokens = strSelection.split("\\:");
    strSelection = ((java.lang.String) (tokens[0]));
    m_myCommand = cmd;
    new com.asksven.commandcenter.BasicMasterFragment.ExecuteCommandTask().execute(strSelection);
    android.widget.Toast.makeText(getActivity(), ("Executing " + (m_myCommand.getCommand())), Toast.LENGTH_LONG).show();
}