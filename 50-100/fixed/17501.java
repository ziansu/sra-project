private void Import_Task() {
    new xyz.jaoafa.mymaid.MyMaid.World_saver().runTaskTimer(this, 0L, 36000L);
    new xyz.jaoafa.mymaid.MyMaid.Dynmap_Update_Render().runTaskTimer(this, 0L, 36000L);
    new xyz.jaoafa.mymaid.MyMaid.AFKChecker(this).runTaskTimer(this, 0L, 1200L);
    new xyz.jaoafa.mymaid.MyMaid.AutoMessage().runTaskTimer(this, 0L, 12000L);
}