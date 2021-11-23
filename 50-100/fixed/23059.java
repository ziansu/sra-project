public void addFmAdaptation(java.lang.String adaptationId, com.longyg.backend.adaptation.fm.FmAdaptation fmAdaptation) {
    if (fmAdaptations.containsKey(adaptationId)) {
        java.util.List<com.longyg.backend.adaptation.fm.FmAdaptation> adapList = fmAdaptations.get(adaptationId);
        if (!(adapList.contains(fmAdaptation))) {
            adapList.add(fmAdaptation);
        }
    }else {
        java.util.List<com.longyg.backend.adaptation.fm.FmAdaptation> adapList = new java.util.ArrayList<>();
        adapList.add(fmAdaptation);
        fmAdaptations.put(adaptationId, adapList);
    }
}