@java.lang.Override
protected void onPostExecute(java.lang.String cityName) {
    super.onPostExecute(cityName);
    if (cityName == null)
        return ;
    
    android.widget.TextView cityView = ((android.widget.TextView) (view.findViewById(R.id.cityName)));
    cityView.setVisibility(View.VISIBLE);
    cityView.setText(cityName);
}