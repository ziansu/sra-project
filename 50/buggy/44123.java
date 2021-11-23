public long getDaysRemaining() {
    return (this.getTotalDays()) - (this.differenceInDays(this.getDateSet(), today, java.util.concurrent.TimeUnit.DAYS));
}