public int getPointCaptures(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    switch (dt) {
        case ACCUM :
            return accum.PointCaptures;
        case MAX :
            return max.PointCaptures;
        case MVMACCUM :
            return -1;
        case MVMMAX :
            return -1;
        default :
            return -1;
    }
}