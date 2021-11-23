private void constructInitialState() {
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.buchiNwa.LevelRankingState<LETTER, STATE> lvlrk = new de.uni_freiburg.informatik.ultimate.automata.nwalibrary.buchiNwa.LevelRankingState<LETTER, STATE>(m_Operand);
    for (STATE state : m_Operand.getInitialStates()) {
        if (m_Operand.isFinal(state)) {
            lvlrk.addRank(m_EmptyStackStateWRI, state, 2, true);
        }else {
            lvlrk.addRank(m_EmptyStackStateWRI, state, 3, false);
        }
    }
    getOrAdd(true, lvlrk);
}