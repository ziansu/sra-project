public void resumeSubmittedHpcJobInfos() {
    for (int status = 0; status <= 2; status++) {
        java.util.List<edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo> submittedHpcJobInfo = hpcJobInfoService.findByStatus(status);
        if (submittedHpcJobInfo != null) {
            for (edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo hpcJobInfo : submittedHpcJobInfo) {
                addNewSubmittedHpcJob(hpcJobInfo);
            }
        }
    }
}