protected void onPostExecute(java.lang.Boolean result) {
    if (result)
        if (adminChose)
            new com.myApplication.yosef.finalproject.AdminChooseSeries.sendActiveSerie().execute();
        
    
}