@java.lang.Override
public void onAddCandidateClicked(com.arcbees.bourseje.shared.Candidate candidate) {
    dispatch.execute(adminService.updateCandidate(candidateToUpdate.getId(), candidate), new com.arcbees.bourseje.client.AdminRestCallback<java.lang.Void>() {
        @java.lang.Override
        public void onSuccess(java.lang.Void result) {
            goToDashboard();
        }
    });
}