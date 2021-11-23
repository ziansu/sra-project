public void setTaxAssessment(java.lang.String taxAssessment) {
    if ((taxAssessment.length()) > 0) {
        this.setTaxAssessment(java.lang.Float.parseFloat(taxAssessment));
    }
}