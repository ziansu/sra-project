private atlantis.position.APosition findPositionToRun_preferAwayFromEnemy(atlantis.units.AUnit unit, atlantis.position.APosition runAwayFrom) {
    atlantis.position.APosition runTo = null;
    java.lang.System.out.println((" ------------------ " + (atlantis.AGame.getTimeFrames())));
    if (runTo == null) {
        double expectedLength = (unit.isVulture()) ? 4 : unit.isWorker() ? 3 : 2.5;
        runTo = atlantis.combat.micro.ARunManager.findRunPositionAtAnyDirection(unit, runAwayFrom, expectedLength);
    }
    return runTo;
}