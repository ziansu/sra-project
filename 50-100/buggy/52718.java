public void retrieveImages() {
    int i = 0;
    for (com.faren.gw2.gw2applicaton.BankObject o : bankData.objects) {
        java.lang.System.out.println(o.item);
        if (!(o.item.imageExists()))
            imagesUrlToDl.add(new com.faren.gw2.gw2applicaton.DataImageToDl(o.item.gwItemData.imageResource, o.getId(), i));
        
        i++;
    }
    if (!(imagesUrlToDl.isEmpty()))
        new com.faren.gw2.gw2applicaton.DownloadImage(this, imagesUrlToDl).execute();
    
}