@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.smileButton)) {
        onNewGame();
    }else
        if (!(isGameEnd)) {
            if (ToolBarLayout.isMineSelect)
                openCell(view);
            else
                setFlag(view);
            
        }
    
}