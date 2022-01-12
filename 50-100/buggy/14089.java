public void nextPage() {
    if ((currentPage) < ((pageCount) - 1)) {
        if (((attemptedAllAvailableMarks()) || (hideDialog)) || (renderer.answerBoxHandler.allBoxesDisabled())) {
            (currentPage)++;
            redraw(group, bounds);
        }
        if ((!(hideDialog)) && (!(renderer.answerBoxHandler.allBoxesDisabled()))) {
            displayWarning();
        }
    }
}