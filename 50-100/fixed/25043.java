@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    afeka.katz.arkadiy.minesweeper.model.enums.GameProgress prog = afeka.katz.arkadiy.minesweeper.model.enums.GameProgress.CONTINUE;
    switch (touchType) {
        case FLAG :
            prog = adapter.setFlag(position);
            break;
        case MINE :
            prog = adapter.open(position);
            break;
    }
    if (prog != (afeka.katz.arkadiy.minesweeper.model.enums.GameProgress.CONTINUE))
        timer.stop();
    
    endController.invoke(prog, ((android.os.SystemClock.elapsedRealtime()) - (timer.getBase())));
}