private void saveState(com.grayraven.electoralcalc.PoJos.State updatedState) {
    int cnt = 0;
    for (com.grayraven.electoralcalc.PoJos.State state : mStateList) {
        if ((mStateList.get(cnt).getAbbr().compareTo(updatedState.getAbbr())) == 0) {
            mStateList.get(cnt).copy(updatedState);
            updateVoteTotals(state);
            return ;
        }
        cnt++;
    }
}