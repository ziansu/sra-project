public void perform() {
    switch (getType()) {
        case SEARCH :
            searchForResource();
            break;
        case CONSUME :
            consumeResource();
            break;
        case ROAM :
            roamFreely();
            break;
        default :
            return ;
    }
    evaluate();
}