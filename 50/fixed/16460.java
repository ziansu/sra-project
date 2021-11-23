public void setCandidate(de.neofonie.udacity.capstone.hirefy.modules.candidates.FbCandidate candidate) {
    mCandidate = candidate;
    if ((mRef) != null) {
        mRef.removeEventListener(this);
    }
    mRef = mCandidatesManager.getCandidateDetails(mCandidate);
    mRef.addValueEventListener(this);
}