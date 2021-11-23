private double mean_count_gamma(int ex_s, int ex_d, int ex_n, int k, int wsdn) {
    if (wsdn == 0)
        return (mean_nkd[k]) - (gamma[ex_s][ex_d][ex_n][k]);
    else
        return (mean_nkw[k][wsdn]) - (gamma[ex_s][ex_d][ex_n][k]);
    
}