private soaringcoach.Flight analyse(soaringcoach.Flight f) throws soaringcoach.analysis.AnalysisException {
    f = new soaringcoach.analysis.DistanceAnalysis().analyse(f);
    f = new soaringcoach.analysis.CirclingAnalysis().analyse(f);
    f = new soaringcoach.analysis.ThermalAnalysis().analyse(f);
    f = new soaringcoach.analysis.WindAnalysis().analyse(f);
    f = new soaringcoach.analysis.CentringAnalysis().analyse(f);
    f = new soaringcoach.analysis.ShortStraightPhasesAnalysis().analyse(f);
    f = new soaringcoach.analysis.FlightSummaryAnalysis().analyse(f);
    return f;
}