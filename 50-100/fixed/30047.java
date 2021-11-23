@java.lang.Override
protected void onPostExecute(java.lang.String cityName) {
    super.onPostExecute(cityName);
    android.widget.TextView cityView = ((android.widget.TextView) (view.findViewById(R.id.cityName)));
    if ((cityName == null) || (cityView == null))
        return ;
    
    cityView.setVisibility(View.VISIBLE);
    cityView.setText(cityName);
}