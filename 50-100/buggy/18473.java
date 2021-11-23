@org.junit.Test
public void shouldAddSyntacticalSugar() throws java.lang.Exception {
    final io.magentys.Agent Tom = io.magentys.AgentProvider.agent();
    Tom.obtains(io.magentys.AgentTest.Printer.aPrinter(), and(io.magentys.AgentTest.Scanner.aScanner())).andHe(io.magentys.AgentTest.Scan.scansThe("important Document"), and(io.magentys.AgentTest.Print.printsTheDocument()));
}