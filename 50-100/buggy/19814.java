public fachklassen.LearningAgreement loescheLearningAgreementPosition(java.lang.String posId, fachklassen.LearningAgreement la) {
    int idx = 0;
    java.util.List<fachklassen.LearningAgreementPosition> laPosen = la.getLearningAgreementPositionen();
    for (fachklassen.LearningAgreementPosition laPos : laPosen) {
        if ((laPos.getLaPosId().compareTo(java.lang.Long.parseLong(posId))) == 0) {
            java.lang.System.out.println(((("Remove PosId: " + posId) + " / At Idx: ") + idx));
            laPosen.remove(idx);
            break;
        }
        idx++;
    }
    la.setLearningAgreementPositionen(laPosen);
    return la;
}