static src.CircularList<src.Candidate> initList(int nbCandidates) {
    src.CircularList<src.Candidate> list = new src.CircularList();
    for (int i = 0; i < nbCandidates; i++) {
        list.add(new src.Candidate(("" + i), ""));
    }
    return list;
}