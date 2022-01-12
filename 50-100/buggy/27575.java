@java.lang.Override
public void execute() {
    door = ctx.objects.name(doorName).nearest(near).each(org.powerbot.script.rt4.GameObject.doSetBounds(bounds)).poll();
    if (door.inViewport()) {
        if (doorName.equals("Ladder")) {
            door.click();
        }else {
            door.interact("Open");
        }
    }else {
        ctx.movement.step(door);
        ctx.camera.turnTo(door);
    }
}