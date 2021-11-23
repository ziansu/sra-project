public void onEnable() {
    initConfig();
    org.takit.dns.TakitDNS.update();
    this.getServer().getScheduler().scheduleSyncDelayedTask(this, new java.lang.Runnable() {
        public void run() {
            org.takit.dns.TakitDNS.update();
        }
    }, (((org.takit.dns.TakitDNS.interval) * 20) * 60));
    org.takit.dns.TakitDNS.log.info(java.lang.String.format(Messages.PLUGIN_ENABLE, getDescription().getName()));
}