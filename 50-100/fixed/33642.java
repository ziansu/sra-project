@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    java.util.List<app.yli.org.flickriptranslator.FlickrFarm> farms = app.yli.org.flickriptranslator.FlickrIpResolver.find();
    if (farms != null) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (app.yli.org.flickriptranslator.FlickrFarm farm : farms) {
            sb.append(java.lang.String.format("%s %s%n", farm.getEastHostIp(), farm.getGlobalHostName()));
        }
        return sb.toString();
    }else {
        return context.getText(R.string.error_info).toString();
    }
}