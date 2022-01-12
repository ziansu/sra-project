private void controllerPost() {
    switch (type) {
        case INSERT :
            controller.postInsert(this);
            break;
        case UPDATE :
        case SOFT_DELETE :
            controller.postUpdate(this);
            break;
        case DELETE :
            controller.postDelete(this);
            break;
        default :
            break;
    }
}