public static com.dehua.courseinformationsystem.utils.FragmentController getInstance(android.support.v4.app.FragmentActivity activity, int containerId) {
    com.dehua.courseinformationsystem.utils.FragmentController.controller = new com.dehua.courseinformationsystem.utils.FragmentController(activity, containerId);
    return com.dehua.courseinformationsystem.utils.FragmentController.controller;
}