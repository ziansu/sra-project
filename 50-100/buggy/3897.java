@javax.ws.rs.GET
@javax.ws.rs.Path(value = "solve")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public uk.co.cranfield.model.Results solve() {
    double period = 1.96;
    double waveHeight = 0.032;
    double depth = 0.78;
    double dout = 0.03;
    double gp1 = 0.0;
    double gp2 = 4;
    double gp3 = 19.0;
    double gp4 = ((uk.co.cranfield.common.Constants.IX) - 1) * (uk.co.cranfield.common.Constants.DX);
    uk.co.cranfield.core.WaveSimulatorSolver solver = new uk.co.cranfield.core.WaveSimulatorSolver(1);
    uk.co.cranfield.model.Results results = solver.solve(period, waveHeight, depth, dout, gp1, gp2, gp3, gp4);
    return results;
}