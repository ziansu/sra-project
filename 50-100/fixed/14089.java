public void nextPage() {
    if ((currentPage) < ((pageCount) - 1)) {
        if (((attemptedAllAvailableMarks()) || (hideDialog)) || (renderer.answerBoxHandler.allBoxesDisabled())) {
            (currentPage)++;
            redraw(group, bounds);
        }else
            if ((!(hideDialog)) && (!(renderer.answerBoxHandler.allBoxesDisabled()))) {
                displayWarning();
            }
        
    }
}