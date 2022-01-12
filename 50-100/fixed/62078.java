@javax.ws.rs.GET
@javax.ws.rs.Produces(value = "text/plain;charset=UTF-8")
@javax.ws.rs.Path(value = "getNext")
public java.lang.String getNext() {
    machine.getNextStep();
    if (cli.getOnline().json) {
        return org.graphwalker.cli.Util.getStepAsJSON(machine, cli.getOnline().verbose, cli.getOnline().unvisited).toString();
    }else {
        return org.graphwalker.cli.Util.getStepAsString(machine, cli.getOnline().verbose, cli.getOnline().unvisited);
    }
}