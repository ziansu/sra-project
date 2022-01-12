public static auto.CommandList notBoilerBlue() {
    auto.CommandList CL = new auto.CommandList();
    comms.SmartWriter.putS("AutoList", "Not Boiler Blue", DebugMode.COMPETITION);
    CL.addCommand(new auto.commands.DriveCommand(new auto.stopConditions.DistanceStopCondition(null, babbage.BabbageAutoLists.distanceFromWall), babbage.BabbageAutoLists.speed));
    CL.addCommand(new auto.commands.TurnCommand(new auto.stopConditions.AngleStopCondition((-45), 1, 0.3)));
    CL.addCommand(new auto.commands.RunPegVisionCommand(1));
    return CL;
}