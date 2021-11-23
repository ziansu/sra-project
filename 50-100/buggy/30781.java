@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(jsonData);
    pd.dismiss();
    if (jsonData.startsWith("Error")) {
        android.widget.Toast.makeText(c, jsonData, Toast.LENGTH_SHORT).show();
    }else {
        new com.example.margo.json.JSONParser(c, jsonData, sp).execute();
    }
}