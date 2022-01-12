@java.lang.Override
public int getItemViewType(int position) {
    return (mHeaders.get(position)) != null ? mn.devfest.sessions.SessionListAdapter.TYPE_HEADER : mn.devfest.sessions.SessionListAdapter.TYPE_SESSION;
}