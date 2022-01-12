public static boolean isHidden(final com.google.api.services.gmail.model.Label label) {
    return ((label != null) && ("labelHide".equals(label.getLabelListVisibility()))) || ("CATEGORY_PERSONAL".equals(label.getName()));
}