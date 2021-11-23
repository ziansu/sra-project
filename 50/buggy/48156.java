@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    inviteParticipants(room, participants, (index + 1));
}