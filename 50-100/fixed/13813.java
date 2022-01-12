public int getTeleports(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    switch (cs) {
        case ENGINEER :
            break;
        default :
            return -1;
    }
    switch (dt) {
        case ACCUM :
            return accum.specNumTeleports;
        case MAX :
            return max.specNumTeleports;
        case MVMACCUM :
            return mvmaccum.specNumTeleports;
        case MVMMAX :
            return mvmmax.specNumTeleports;
    }
    return -1;
}