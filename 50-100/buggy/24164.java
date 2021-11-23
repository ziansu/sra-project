@java.lang.Override
public void pull(de.htwg.risiko.turn.Turn turn) {
    maxRecruitment = turn.getMaxRecruitment();
    if ((maxRecruitment) <= 0) {
        turn.setState(new de.htwg.risiko.turn.InvadeTurn());
        return ;
    }
    recCountry = turn.getRecCountry();
    recruitment = turn.getRecruitment();
    addRecruitment();
    turn.setMaxRecruitment(((turn.getMaxRecruitment()) - (recruitment)));
}