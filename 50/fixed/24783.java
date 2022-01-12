public void setSqlProjectStart(java.sql.Date projectStart) {
    if (projectStart != null) {
        this.projectStart = projectStart.toLocalDate();
    }
}