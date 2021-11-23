public void showItem(ru.napadovskiu.tracker.Item[] arrayItem) {
    for (ru.napadovskiu.tracker.Item tmpItem : arrayItem) {
        if (tmpItem != null) {
            java.lang.System.out.println(tmpItem.toString());
        }
    }
}