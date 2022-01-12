@java.lang.Override
public void push(android.os.Bundle UpdateSnapshot) {
    if (UpdateSnapshot == null)
        return ;
    
    UpdateContent = UpdateSnapshot;
    ViewUpdate.post(this);
}