public void perform(com.km.mouse.Mouse mouse) {
    switch (getType()) {
        case SEARCH :
            searchForResource(mouse);
            break;
        case CONSUME :
            consumeResource(mouse);
            break;
        case ROAM :
            roamFreely(mouse);
            break;
        default :
            return ;
    }
    evaluate(mouse);
}