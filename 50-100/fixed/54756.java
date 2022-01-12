public void onTick(long millisUntilFinished) {
    toastline += 4;
    if ((toastline) < (ss.length)) {
        java.lang.String s = ss[toastline];
        for (int i = (toastline) + 1; (i < ((toastline) + 4)) && (i < (ss.length)); i++)
            s += "\n" + (ss[i]);
        
        android.widget.Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();
    }
}