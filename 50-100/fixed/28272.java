private void contact_cloud() {
    if (!(MainFrame.gameInfo.MUSHROOM_EFFECT)) {
        pony.setLives(((pony.getLives()) - 1));
        if ((pony.getLives()) == 0) {
            counter.stop();
            javax.swing.JOptionPane.showMessageDialog(null, "Вы проиграли", "Сообщение", 0);
            reset_game();
            showMainMenu();
        }else {
            dieTime = (java.lang.System.currentTimeMillis()) / 1000;
            isRunning = true;
        }
    }else {
        isRunning = true;
    }
}