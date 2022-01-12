public boolean isSubmittedOnTime(conference_package.Paper thePaper) {
    if ((thePaper.getSubmissionDate().getTime()) <= (myPaperDeadline.getTime())) {
        return true;
    }else {
        return false;
    }
}