@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    int position = getAdapterPosition();
    com.neuron64.ftp.domain.model.UserConnection connection = at(position);
    switch (item.getItemId()) {
        case R.id.action_change :
            {
                onItemClickListener.onChangeConnection(connection, position);
                return true;
            }
        case R.id.action_delete :
            {
                onItemClickListener.onDeleteConnection(connection, position);
                return true;
            }
        case R.id.action_test :
            {
                onItemClickListener.onTestConnection(connection, position);
                return true;
            }
    }
    return false;
}