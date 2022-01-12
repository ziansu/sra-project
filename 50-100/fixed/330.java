@java.lang.Override
public void run() {
    com.thefunteam.android.model.Model model = com.thefunteam.android.model.Atom.getInstance().getModel();
    if ((model.getCurrentGame()) == null) {
        currentGameActivity.finish();
    }else
        if (model.getCurrentGame().isStarted()) {
            currentGameActivity.presentGame();
        }else {
            currentGameActivity.update(model);
        }
    
    if ((model.getErrorMessage()) != null) {
        currentGameActivity.showError(model.getErrorMessage());
    }
}