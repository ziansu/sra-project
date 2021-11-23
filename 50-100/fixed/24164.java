@java.lang.Override
public void pull(de.htwg.risiko.turn.Turn turn) {
    maxRecruitment = turn.getMaxRecruitment();
    recCountry = turn.getRecCountry();
    recruitment = turn.getRecruitment();
    addRecruitment(turn);
    if ((turn.getMaxRecruitment()) == 0) {
        turn.setState(new de.htwg.risiko.turn.InvadeTurn());
        return ;
    }
}