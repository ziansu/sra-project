public fvs.taxe.actor.TrainActor renderTrain(gameLogic.resource.Train train) {
    fvs.taxe.actor.TrainActor trainActor = new fvs.taxe.actor.TrainActor(train);
    trainActor.addListener(new fvs.taxe.dialog.TrainClicked(context, train));
    trainActor.setVisible(false);
    context.getStage().addActor(trainActor);
    return trainActor;
}