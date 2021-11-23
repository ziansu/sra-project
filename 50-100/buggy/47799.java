public void removeItem() {
    Main.StopOverOverview.StopOverOverview.allItems.remove(((Main.StopOverOverview.StopOverOverview.allItems.size()) - 1));
    this.getChildren().remove(Main.StopOverOverview.StopOverOverview.allItems.get(((Main.StopOverOverview.StopOverOverview.allItems.size()) - 1)));
}