@java.lang.Override
public void onClick(android.view.View v) {
    setTaskImage();
    if (isTeamATurn)
        android.widget.Toast.makeText(com.example.michael.archerygame.GameActivity.getGameContext(), getNextPlayerTeamA(), Toast.LENGTH_SHORT);
    else
        android.widget.Toast.makeText(com.example.michael.archerygame.GameActivity.getGameContext(), getNextPlayerTeamB(), Toast.LENGTH_SHORT);
    
    isTeamATurn = !(isTeamATurn);
}