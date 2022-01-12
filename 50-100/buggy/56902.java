@java.lang.Override
public void rollDice() {
    if (this.getRollView().isModalShowing()) {
        this.getRollView().closeModal();
    }
    int rollNum = -1;
    try {
        rollNum = client.clientFacade.ClientFacade.getInstance().rollDice();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    getResultView().setRollValue(rollNum);
    getResultView().showModal();
    timer.cancel();
}