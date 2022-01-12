@java.lang.Override
public void onLoad() {
    game.stageBackground.addActor(imgWinter);
    game.stageBackground.addActor(imgWinter2);
    game.stageBackground.addActor(star1);
    game.stageBackground.addActor(star2);
    addDogs();
    net.heinousgames.game.doggoisland.stages.Level002 level002 = new net.heinousgames.game.doggoisland.stages.Level002(game, false);
    this.doors.add(new net.heinousgames.game.doggoisland.DoorLink(this, level002, 95, 5, 6, 5));
    rootGroup.orderByZindex();
}