public eu.learnpad.qm.component.QuestionnaireGenerationStatus getGenerationStatus(java.lang.String genProcessID) {
    eu.learnpad.qm.component.QuestionnaireGenerationStatus currentStatus = this.generationStatusMap.get(genProcessID);
    if (currentStatus == null) {
        currentStatus = QuestionnaireGenerationStatus.NotAvailable;
    }else {
        switch (currentStatus) {
            case InProgress :
                this.generationStatusMap.put(genProcessID, QuestionnaireGenerationStatus.Completed);
                break;
            case Completed :
                break;
            default :
                currentStatus = QuestionnaireGenerationStatus.NotAvailable;
                break;
        }
    }
    return currentStatus;
}