public static java.lang.String getMsg(java.lang.String msg, double amount, java.lang.String killed, java.lang.String killer, java.lang.String karma) {
    msg = msg.replace("<killed>", killed).replace("<killer>", killer);
    if ((com.codisimus.plugins.pvpreward.PvPReward.negative) && (!(karma.equals("0"))))
        msg = msg.replace("<karma>", ("-" + karma));
    else
        msg = msg.replace("<karma>", karma);
    
    return msg.replace("<amount>", com.codisimus.plugins.pvpreward.Econ.format(amount));
}