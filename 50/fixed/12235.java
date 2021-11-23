public static org.gufroan.wearwolf.data.Part goBack() {
    org.gufroan.wearwolf.data.Part result = null;
    if ((org.gufroan.wearwolf.NavigationEngine.cursor.getParent()) != null) {
        org.gufroan.wearwolf.NavigationEngine.cursor = org.gufroan.wearwolf.NavigationEngine.cursor.getParent();
        result = org.gufroan.wearwolf.NavigationEngine.cursor.getData();
    }
    return result;
}