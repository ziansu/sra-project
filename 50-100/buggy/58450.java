public void disconnect() {
    area1.setText("");
    area2.setText("");
    setTitle("Disconnected");
    er.changeStrategy(new Project.strategies.LocalEventStrategy(area2));
    changed = false;
    Save.setEnabled(false);
    SaveAs.setEnabled(false);
}