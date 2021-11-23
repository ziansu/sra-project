public void disconnect() {
    setTitle("Disconnected");
    area1.setText("");
    if (!(area2.getText().equals(""))) {
        area2.setText("");
    }
    er.changeStrategy(new Project.strategies.LocalEventStrategy(area2));
    changed = false;
    Save.setEnabled(false);
    SaveAs.setEnabled(false);
}