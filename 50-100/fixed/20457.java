public java.lang.String getEvaluationDatePresentation() {
    if (((getEvaluationDateTime()) != null) && (!(getEvaluationDateTime().toString().contains("00:00")))) {
        return getEvaluationDateTime().toString(EnrolmentEvaluationServices.EVALUATION_DATE_TIME_FORMAT);
    }else {
        return getEvaluationDate().toString(EnrolmentEvaluationServices.EVALUATION_DATE_FORMAT);
    }
}