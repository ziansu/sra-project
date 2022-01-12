@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (touchType) {
        case FLAG :
            adapter.setFlag(position);
            break;
        case MINE :
            afeka.katz.arkadiy.minesweeper.model.enums.GameProgress prog = adapter.open(position);
            if (prog != (afeka.katz.arkadiy.minesweeper.model.enums.GameProgress.CONTINUE))
                timer.stop();
            
            endController.invoke(prog, ((android.os.SystemClock.elapsedRealtime()) - (timer.getBase())));
            break;
    }
}