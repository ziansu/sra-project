public void onClick(android.view.View v) {
    android.content.Intent choose = new android.content.Intent(getApplicationContext(), com.sssfs.hyakuremember.ChooseActivity.class);
    switch (v.getId()) {
        case R.id.rdm :
            choose.putExtra("CHOOSED", 1);
            startActivity(choose);
            break;
        case R.id.ord :
            choose.putExtra("CHOOSED", 2);
            startActivity(choose);
            break;
    }
}