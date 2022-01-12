public void updateItem(java.lang.String item, boolean empty) {
    super.updateItem(item, empty);
    if (!(isEmpty())) {
        this.setUnderline(false);
        Model.Team t = saveGame.getDB().findTeam(this.getItem());
        if (t.getNm().equals(saveGame.getMyTeam().getNm())) {
            this.setUnderline(true);
        }
        setText(item);
    }
}