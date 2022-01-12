final boolean walkToBlastArea() {
    org.powerbot.script.Tile random = new org.powerbot.script.Tile((1939 + ((int) (java.lang.Math.round(((java.lang.Math.random()) * 3))))), 4967);
    java.lang.System.out.println(random);
    ctx.movement.step(random);
    ctx.camera.angle(getRandomAngle(jaccob.blastfurnace.BlastFurnace.BLAST_YAWS));
    return waitTillReasonableStop(2);
}