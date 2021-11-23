@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    com.neuron64.ftp.domain.model.UserConnection connection = at(getAdapterPosition());
    switch (item.getItemId()) {
        case R.id.action_change :
            {
                onItemClickListener.onChangeConnection(connection, getAdapterPosition());
                break;
            }
        case R.id.action_delete :
            {
                onItemClickListener.onDeleteConnection(connection, getAdapterPosition());
                break;
            }
        case R.id.action_test :
            {
                onItemClickListener.onTestConnection(connection, getAdapterPosition());
                break;
            }
    }
    return false;
}