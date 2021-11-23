public void installPlugins() throws java.lang.Exception {
    eversync.plugins.PluginManager.log.info("Initializing plugins ...");
    eversync.plugins.PluginManager.log.info("-- Initializing Evernote plugin ...");
    eversync.plugins.Evernote.EvernotePlugin evernote = new eversync.plugins.Evernote.EvernotePlugin("S=s1:U=8de6c:E=1539a0de540:C=14c425cb838:P=1cd:A=en-devtoken:V=2:H=0087ea0c97f17d7b445052d6b6c84ee9");
    installPlugin("Evernote", evernote);
    eversync.plugins.PluginManager.log.info("-- Initializing Flickr plugin ...");
    eversync.plugins.Flickr.FlickrPlugin flickr = new eversync.plugins.Flickr.FlickrPlugin("ddbf3a3f6229d256481d4aeabaa99a63", "ca346c4fa57f2106", "72157650764299927-66c79182ad3b0d5e", "8a38b15c114110ce");
    installPlugin("Flickr", flickr);
    eversync.plugins.PluginManager.log.info("All plugins initialized successfully!");
}