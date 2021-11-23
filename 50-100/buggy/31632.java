@java.lang.Override
protected void onPostExecute(java.lang.Boolean parsingError) {
    increment = (increment) + 10;
    progressBar.setProgress(increment);
    if (((increment) == 60) && (parsingError == true)) {
        if (parsingError) {
            android.content.Intent it = new android.content.Intent();
            it.setClass(this, com.andura.campina.main.MainActivity.class);
            startActivity(it);
            this.finish();
        }else {
            android.widget.Toast.makeText(this, "Error to Download Images from Nasa.", Toast.LENGTH_LONG).show();
        }
    }
}