@java.lang.Override
public void joinGame(shared.definitions.CatanColor color) {
    if (state.joinGame(color)) {
        stopTimer();
        if (getSelectColorView().isModalShowing())
            getSelectColorView().closeModal();
        
        model.ModelFacade.getInstance().updateGameModel();
        joinAction.execute();
        model.ModelFacade.getInstance().getPoller().start();
    }
}