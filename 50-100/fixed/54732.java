void generateStatus() {
    if (((this.errors) == null) || ((this.errors.size()) == 0)) {
        this.errors = null;
        this.statusRating = 4;
        this.statusText = org.smarterbalanced.itemviewerservice.core.DiagnosticApi.BaseDiagnostic.convertToStatusText(this.statusRating);
    }else {
        this.statusRating = 0;
        this.statusText = org.smarterbalanced.itemviewerservice.core.DiagnosticApi.BaseDiagnostic.convertToStatusText(this.statusRating);
    }
}