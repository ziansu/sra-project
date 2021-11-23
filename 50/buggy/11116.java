private boolean checkTermination() {
    return ((!(this.open.isEmpty())) && ((result.getGenerated()) < (domain.maxGeneratedSize()))) && (result.checkMinTimeOut());
}