private void controllerPost() {
    switch (type) {
        case INSERT :
            controller.postInsert(this);
            break;
        case UPDATE :
            controller.postUpdate(this);
            break;
        case DELETE :
        case SOFT_DELETE :
            controller.postDelete(this);
            break;
        default :
            break;
    }
}