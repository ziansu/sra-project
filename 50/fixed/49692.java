@java.lang.Override
public java.lang.Void call() {
    java.lang.System.out.println(("[FINE] SelectMediaPresentation.MediaItemTreeCell.updateItem(...).new Task() {...}.call() - Loading data for: " + item));
    item.loadData(itemEnricher);
    return null;
}