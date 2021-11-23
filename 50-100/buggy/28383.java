water.rapids.Vec[] close() {
    water.rapids.Futures fs = new water.rapids.Futures();
    water.rapids.Vec[] vgrps = new water.rapids.Vec[_gss.size()];
    final int rowLayout = _appendables[0].compute_rowLayout();
    for (int i = 0; i < (vgrps.length); i++)
        vgrps[i] = _appendables[i].close(rowLayout, fs);
    
    fs.blockForPending();
    return vgrps;
}