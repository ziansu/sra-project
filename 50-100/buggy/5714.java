private org.inventivetalent.bossbar.BossBarAPI.Color parseColor(java.lang.String name) {
    if (name.trim().isEmpty()) {
        return null;
    }
    try {
        return org.inventivetalent.bossbar.BossBarAPI.Color.valueOf(name.toUpperCase());
    } catch (java.lang.IllegalArgumentException argumentException) {
        return null;
    }
}