private gdsc.smlm.results.IdPeakResult createResult(int t, float x, float y) {
    gdsc.smlm.results.IdPeakResult r = new gdsc.smlm.results.IdPeakResult(t, x, y, (++(id)));
    r.noise = 1;
    return r;
}