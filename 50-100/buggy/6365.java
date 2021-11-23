private static void initParameters() {
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numGuidsPerAccount = edu.umass.cs.utils.Config.getGlobalInt(GNSTC.NUM_GUIDS_PER_ACCOUNT);
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.accountGuidsOnly = edu.umass.cs.utils.Config.getGlobalBoolean(GNSTC.ACCOUNT_GUIDS_ONLY);
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numClients = edu.umass.cs.utils.Config.getGlobalInt(TC.NUM_CLIENTS);
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numGuids = edu.umass.cs.utils.Config.getGlobalInt(TC.NUM_GROUPS);
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numAccountGuids = (edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.accountGuidsOnly) ? edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numGuids : java.lang.Math.max(((edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numGuids) / (edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numGuidsPerAccount)), 1);
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.executor = ((java.util.concurrent.ScheduledThreadPoolExecutor) (java.util.concurrent.Executors.newScheduledThreadPool(edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numClients)));
    edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.accountGuidEntries = new edu.umass.cs.gnsclient.client.GuidEntry[edu.umass.cs.gnsclient.client.bugreports.fixed.SubGuidDeletesFail.numClients];
}