private void onUseretail(bhartiairtel.themehackathon.pojo.GetUserDetailsResponseBean result) {
    android.content.Intent in = new android.content.Intent(this, bhartiairtel.themehackathon.main.NavigationDrawerActivity.class);
    in.putExtra("result", result);
    startActivity(in);
    finish();
}