public void loadScanConfig() {
    org.jdom2.Element root = doc.getRootElement().getChild("scan");
    scanSettings.clear();
    scanSettings.add(root.getChildText("scanner"));
    scanSettings.add(root.getChildText("resolution"));
    scanSettings.add(root.getChildText("width"));
    scanSettings.add(root.getChildText("height"));
}