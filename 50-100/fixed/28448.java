public int getSentryKills(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    switch (cs) {
        case ENGINEER :
            break;
        default :
            return -1;
    }
    switch (dt) {
        case ACCUM :
            return -1;
        case MAX :
            return max.specSentryKills;
        case MVMACCUM :
            return -1;
        case MVMMAX :
            return mvmmax.specSentryKills;
    }
    return -1;
}