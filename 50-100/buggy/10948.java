@java.lang.Override
public void onClick(android.view.View v) {
    if (holder.joinButton.getText().equals(getString(R.string.game_lobby_button_join_team))) {
        if (dbTeam.addDBPlayer(getRef(position))) {
            holder.joinButton.setText(getString(R.string.game_lobby_button_leave_team));
        }else {
            android.widget.Toast.makeText(getActivity().getApplicationContext(), "This team is full", Toast.LENGTH_SHORT).show();
        }
    }else {
        dbTeam.removeDBPlayer(getRef(position));
        holder.joinButton.setText(getString(R.string.game_lobby_button_join_team));
    }
}