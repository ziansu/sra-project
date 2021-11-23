public java.lang.Boolean hasChanged() {
    if ((!(savedAnswers.equals(selectedAnswers))) && (!(savedAnswers.isEmpty()))) {
        return true;
    }else
        return false;
    
}