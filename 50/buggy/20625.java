public static boolean isHidden(final com.google.api.services.gmail.model.Label label) {
    return ("labelHide".equals(label.getLabelListVisibility())) || ("CATEGORY_PERSONAL".equals(label.getName()));
}