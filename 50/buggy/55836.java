@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if ((savedInstanceState != null) && (savedInstanceState.getBoolean("isConflict", false)))
        return ;
    
    super.onActivityCreated(savedInstanceState);
}