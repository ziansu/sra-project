public void callback(java.lang.String result) {
    switch (result) {
        case "1" :
            toast(com.epfl.dedis.cisc.ERR_NOT_FOUND);
            break;
        case "2" :
            toast(com.epfl.dedis.cisc.ERR_REFUSED);
            break;
        default :
            {
                id = result;
                writeLog();
                android.content.Intent i = new android.content.Intent(this, com.epfl.dedis.cisc.ConfigActivity.class);
                startActivity(i);
                this.finish();
            }
    }
}