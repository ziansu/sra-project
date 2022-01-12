public void changed(com.mygdx.game.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    if (readyCheckBox.isChecked()) {
        org.json.simple.JSONObject readyMessage = new org.json.simple.JSONObject();
        readyMessage.put("type", "readyStatus");
        readyMessage.put("readyStatus", readyCheckBox.isChecked());
        out.println(readyMessage);
        playerToCheckBoxMap.get(localPlayer).setChecked(readyCheckBox.isChecked());
    }
}