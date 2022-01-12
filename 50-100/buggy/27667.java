public java.lang.String execute() {
    Command.DELETE_TYPE type = parser.getDeleteType();
    java.util.ArrayList<java.lang.Integer> indexes = parser.getTaskToDelete();
    switch (type) {
        case ALL :
            return deleteAll();
        case MULTIPLE :
        case RANGE :
        case SINGLE :
            return delete(indexes);
        default :
            return "Invalid Delete Type.";
    }
}