public static auto.CommandList centerRed() {
    auto.CommandList CL = new auto.CommandList();
    comms.SmartWriter.putS("AutoList", "centerRed", DebugMode.COMPETITION);
    CL.addCommand(new auto.commands.DriveCommand(new auto.stopConditions.DistanceStopCondition(null, babbage.BabbageAutoLists.distanceFromWall), babbage.BabbageAutoLists.speed));
    CL.addCommand(new auto.commands.RunPegVisionCommand(1));
    return CL;
}