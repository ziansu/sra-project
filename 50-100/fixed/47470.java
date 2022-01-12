public static void main(java.lang.String[] args) {
    builder.ComputerBuilderDirector CompBuildDirector = new builder.ComputerBuilderDirectorImp(new builder.MyComputerBuilderImp());
    model.computer.Computer myComp = CompBuildDirector.construct();
    myComp.installOS("Linux", new model.computer.program.os.Linux());
    myComp.launchOS("Linux");
    myComp.installApplication("Calculator", new model.computer.program.calculator.Calculator());
    myComp.installApplication("FileManager", new model.computer.program.filemanager.FileManager());
    myComp.launchApplication("Calculator");
    myComp.launchApplication("FileManager");
}