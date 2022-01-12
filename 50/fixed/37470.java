@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
@java.lang.Override
public void onClick(android.view.View view) {
    if (runningSpeurtocht) {
        stopQuest();
    }else {
        getRandomGoal();
        startQuest();
    }
}