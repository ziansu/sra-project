public void setVulnerable(boolean vulnerable) {
    for (int i = 0; i < (data.size()); i++) {
        messages.Player temp = ((messages.Player) (data.get(i)));
        if (temp.getCharacter().toLowerCase().equals("ghost")) {
            temp.setVulnerability(vulnerable);
        }
    }
}