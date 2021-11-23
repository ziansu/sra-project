@java.lang.Override
public void onClick(android.view.View v) {
    if (current_player.purchase(rowItem)) {
        android.widget.Toast.makeText(getContext(), ((" +1 " + (rowItem.getName())) + " purchased!"), Toast.LENGTH_SHORT).show();
        com.app.game.quizee.backend.BackEndManager.updateAchievements(current_player, getContext());
        notifyDataSetChanged();
    }
}