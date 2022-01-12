public edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.TruckDodgeRamBuilderInterface askForTruckDrive() {
    edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.TerminalPrompterBuilder truckDrivePrompter = edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.TerminalPrompterBuilder.newBuilder();
    try {
        truckDriveChoice = truckDrivePrompter.addType("Drive").addOption(new edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.FourByTwoTruckDrive()).addOption(new edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.FourByFourTruckDrive()).sort().build().ask();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e);
    }
    truckDrive = ((edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders.TruckDrive) (truckDrivePrompter.getOptions().get(((truckDriveChoice) - 1))));
    return this;
}