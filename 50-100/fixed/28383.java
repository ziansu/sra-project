water.rapids.Vec[] close() {
    water.rapids.Futures fs = new water.rapids.Futures();
    water.rapids.Vec[] vgrps = new water.rapids.Vec[_gss.size()];
    for (int i = 0; i < (vgrps.length); i++)
        vgrps[i] = _appendables[i].close(_appendables[i].compute_rowLayout(), fs);
    
    fs.blockForPending();
    return vgrps;
}