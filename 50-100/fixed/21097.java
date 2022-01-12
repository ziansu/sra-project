@java.lang.Override
public void onClick(android.view.View v) {
    java.util.HashMap<java.lang.String, java.lang.String> data = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (com.microsoft.adaptivecards.renderer.inputhandler.IInputHandler inputHandler : m_inputHandlerList) {
        java.lang.Exception excep = inputHandler.getData(data);
        if (excep != null) {
            android.widget.Toast.makeText(v.getContext(), excep.getMessage(), Toast.LENGTH_SHORT).show();
            return ;
        }
    }
    m_submitActionHandler.onSubmit(m_submitAction, data);
}