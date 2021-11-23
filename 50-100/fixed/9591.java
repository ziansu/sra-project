private void setKeyAction() {
    android.os.Bundle args = getArguments();
    java.lang.String key = ((java.lang.String) (args.keySet().toArray()[0]));
    switch (key) {
        case "meetings_show_day_key" :
            showDay = true;
            date = ((java.lang.String) (args.get(key)));
            break;
        case "meetings_show_all_key" :
            showAll = true;
            break;
        case "meetings_show_empty_key" :
            isEmptyView = true;
            break;
        default :
            isEmptyView = true;
    }
}