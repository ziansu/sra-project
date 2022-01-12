public int compare(com.model.TrainingCommentPostingModel tFirst, com.model.TrainingCommentPostingModel tSecond) {
    if ((tFirst.getDate()) > (tSecond.getDate()))
        return 1;
    else
        if ((tFirst.getDate()) < (tSecond.getDate()))
            return -1;
        else
            return 0;
        
    
}