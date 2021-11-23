private static java.lang.String getDisplayY(java.lang.String display_name) {
    if (com.kerbybit.chattriggers.objects.DisplayHandler.displays_xy.containsKey(display_name)) {
        return (com.kerbybit.chattriggers.objects.DisplayHandler.displays_xy.get(display_name)[1]) + "";
    }else {
        return ("Display " + display_name) + " has no y to get";
    }
}