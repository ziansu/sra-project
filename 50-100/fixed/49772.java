@java.lang.Override
protected it.simonedegiacomi.goboxapi.GBFile doInBackground(it.simonedegiacomi.goboxapi.GBFile... params) {
    try {
        if (!(client.isReady())) {
            if (!(client.init()))
                return null;
            
        }
        return client.getInfo(params[0]);
    } catch (it.simonedegiacomi.goboxapi.client.ClientException ex) {
        try {
            client.shutdown();
        } catch (it.simonedegiacomi.goboxapi.client.ClientException e) {
        }
        return null;
    }
}