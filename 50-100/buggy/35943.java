public void add(android.view.View v) {
    if ((anzahl) < 10) {
        android.content.Intent intent = new android.content.Intent(this, com.example.dc.carmanager.POI.class);
        if (setstartort)
            intent.putExtra(com.example.dc.carmanager.MainActivity.EXTRA_MESSAGE, anzahl);
        else
            intent.putExtra(com.example.dc.carmanager.MainActivity.EXTRA_MESSAGE, (-1));
        
        startActivity(intent);
    }
}