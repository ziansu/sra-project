@java.lang.Override
protected void result(java.lang.Object obj) {
    if (obj == "CANCEL") {
        this.remove();
    }else {
        fvs.taxe.dialog.TrainClicked clicker = new fvs.taxe.dialog.TrainClicked(context, ((gameLogic.resource.Train) (obj)));
        clicker.clicked(null, (-1), 0);
    }
}