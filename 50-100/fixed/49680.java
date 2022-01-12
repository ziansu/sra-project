private void parseHealth(java.lang.String response) {
    java.lang.String healthBar = alsa.general.Utils.between(response, "<b id=\"healthValue\" class=\"\">", "<i id=\"healthTimer\"");
    java.lang.String current = healthBar.substring(0, healthBar.indexOf("</b>"));
    java.lang.String maxHealth = alsa.general.Utils.between(healthBar, "</b><b>/", "</b>");
    this.cur_health = java.lang.Long.parseLong((current.isEmpty() ? "0" : current));
    this.health = java.lang.Long.parseLong((maxHealth.isEmpty() ? "0" : maxHealth));
}