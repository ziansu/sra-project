public void keyTyped() {
    if (dead) {
        if ((key) == (BACKSPACE)) {
            name = name.substring(0, ((name.length()) - 1));
        }else
            if ((key) == (ENTER)) {
                try {
                    chkHighscore();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }else {
                name += key;
            }
        
    }
}