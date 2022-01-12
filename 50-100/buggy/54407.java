public static java.lang.String getMsg(java.lang.String msg, double amount, java.lang.String killed, java.lang.String killer, java.lang.String karma) {
    msg = msg.replaceAll("<killed>", killed).replaceAll("<killer>", killer);
    if ((com.codisimus.plugins.pvpreward.PvPReward.negative) && (!(karma.equals("0"))))
        msg = msg.replaceAll("<karma>", ("-" + karma));
    else
        msg = msg.replaceAll("<karma>", karma);
    
    return msg.replaceAll("<amount>", com.codisimus.plugins.pvpreward.Econ.format(amount));
}